package com.c_od_e.pagination.db;

import java.lang.System;

@androidx.room.Database(version = 1, entities = {com.c_od_e.pagination.model.Cat.class, com.c_od_e.pagination.db.RemoteKey.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/c_od_e/pagination/db/CatDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getCatDao", "Lcom/c_od_e/pagination/db/CatDao;", "getKeysDao", "Lcom/c_od_e/pagination/db/RemoteKeyDao;", "app_debug"})
public abstract class CatDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.c_od_e.pagination.db.CatDao getCatDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.c_od_e.pagination.db.RemoteKeyDao getKeysDao();
    
    public CatDatabase() {
        super();
    }
}