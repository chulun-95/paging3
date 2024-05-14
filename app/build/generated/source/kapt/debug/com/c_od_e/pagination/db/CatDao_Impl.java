package com.c_od_e.pagination.db;

import android.database.Cursor;
import androidx.paging.DataSource;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.c_od_e.pagination.model.Cat;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CatDao_Impl implements CatDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Cat> __insertionAdapterOfCat;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public CatDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCat = new EntityInsertionAdapter<Cat>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `cats` (`id`,`url`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Cat value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUrl());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM cats";
        return _query;
      }
    };
  }

  @Override
  public Object insertAll(final List<Cat> cats, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCat.insert(cats);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public PagingSource<Integer, Cat> getAll() {
    final String _sql = "SELECT * FROM cats";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, Cat>() {
      @Override
      public LimitOffsetDataSource<Cat> create() {
        return new LimitOffsetDataSource<Cat>(__db, _statement, false , "cats") {
          @Override
          protected List<Cat> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
            final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(cursor, "url");
            final List<Cat> _res = new ArrayList<Cat>(cursor.getCount());
            while(cursor.moveToNext()) {
              final Cat _item;
              final String _tmpId;
              if (cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = cursor.getString(_cursorIndexOfId);
              }
              final String _tmpUrl;
              if (cursor.isNull(_cursorIndexOfUrl)) {
                _tmpUrl = null;
              } else {
                _tmpUrl = cursor.getString(_cursorIndexOfUrl);
              }
              _item = new Cat(_tmpId,_tmpUrl);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    }.asPagingSourceFactory().invoke();
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
