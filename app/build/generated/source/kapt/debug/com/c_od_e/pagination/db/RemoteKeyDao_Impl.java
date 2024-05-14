package com.c_od_e.pagination.db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RemoteKeyDao_Impl implements RemoteKeyDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RemoteKey> __insertionAdapterOfRemoteKey;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public RemoteKeyDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRemoteKey = new EntityInsertionAdapter<RemoteKey>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `remote_keys` (`catId`,`prevKey`,`nextKey`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RemoteKey value) {
        if (value.getCatId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCatId());
        }
        if (value.getPrevKey() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getPrevKey());
        }
        if (value.getNextKey() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getNextKey());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM remote_keys";
        return _query;
      }
    };
  }

  @Override
  public Object insertAll(final List<RemoteKey> remoteKey, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRemoteKey.insert(remoteKey);
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
  public Object remoteKeysCatId(final String id, final Continuation<? super RemoteKey> p1) {
    final String _sql = "SELECT * FROM remote_keys WHERE catId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<RemoteKey>() {
      @Override
      public RemoteKey call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCatId = CursorUtil.getColumnIndexOrThrow(_cursor, "catId");
          final int _cursorIndexOfPrevKey = CursorUtil.getColumnIndexOrThrow(_cursor, "prevKey");
          final int _cursorIndexOfNextKey = CursorUtil.getColumnIndexOrThrow(_cursor, "nextKey");
          final RemoteKey _result;
          if(_cursor.moveToFirst()) {
            final String _tmpCatId;
            if (_cursor.isNull(_cursorIndexOfCatId)) {
              _tmpCatId = null;
            } else {
              _tmpCatId = _cursor.getString(_cursorIndexOfCatId);
            }
            final Integer _tmpPrevKey;
            if (_cursor.isNull(_cursorIndexOfPrevKey)) {
              _tmpPrevKey = null;
            } else {
              _tmpPrevKey = _cursor.getInt(_cursorIndexOfPrevKey);
            }
            final Integer _tmpNextKey;
            if (_cursor.isNull(_cursorIndexOfNextKey)) {
              _tmpNextKey = null;
            } else {
              _tmpNextKey = _cursor.getInt(_cursorIndexOfNextKey);
            }
            _result = new RemoteKey(_tmpCatId,_tmpPrevKey,_tmpNextKey);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
