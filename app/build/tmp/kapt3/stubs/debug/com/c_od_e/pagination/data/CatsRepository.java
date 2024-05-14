package com.c_od_e.pagination.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00110\u0010H\u0007J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00110\u0010H\u0007J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00110\u0010H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/c_od_e/pagination/data/CatsRepository;", "", "catApi", "Lcom/c_od_e/pagination/network/CatApi;", "database", "Lcom/c_od_e/pagination/db/CatDatabase;", "(Lcom/c_od_e/pagination/network/CatApi;Lcom/c_od_e/pagination/db/CatDatabase;)V", "deleteDummyData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fillWithDummyCats", "dummyCats", "", "Lcom/c_od_e/pagination/model/Cat;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCatsFromDb", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "getCatsFromMediator", "getCatsFromNetwork", "app_debug"})
public final class CatsRepository {
    private final com.c_od_e.pagination.network.CatApi catApi = null;
    private final com.c_od_e.pagination.db.CatDatabase database = null;
    
    @org.jetbrains.annotations.NotNull()
    @androidx.paging.ExperimentalPagingApi()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.c_od_e.pagination.model.Cat>> getCatsFromNetwork() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.paging.ExperimentalPagingApi()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.c_od_e.pagination.model.Cat>> getCatsFromDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.paging.ExperimentalPagingApi()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.c_od_e.pagination.model.Cat>> getCatsFromMediator() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object fillWithDummyCats(@org.jetbrains.annotations.NotNull()
    java.util.List<com.c_od_e.pagination.model.Cat> dummyCats, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteDummyData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public CatsRepository(@org.jetbrains.annotations.NotNull()
    com.c_od_e.pagination.network.CatApi catApi, @org.jetbrains.annotations.NotNull()
    com.c_od_e.pagination.db.CatDatabase database) {
        super();
    }
}