package com.c_od_e.pagination.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\'\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lcom/c_od_e/pagination/core/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "cats", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/c_od_e/pagination/model/CatListItem;", "getCats", "()Lkotlinx/coroutines/flow/Flow;", "cats$delegate", "Lkotlin/Lazy;", "dataSource", "Lcom/c_od_e/pagination/model/Cat;", "getDataSource", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy cats$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.c_od_e.pagination.model.Cat>> getDataSource();
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.c_od_e.pagination.model.CatListItem>> getCats() {
        return null;
    }
    
    public BaseViewModel() {
        super();
    }
}