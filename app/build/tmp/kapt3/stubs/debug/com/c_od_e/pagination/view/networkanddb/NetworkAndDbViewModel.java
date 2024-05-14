package com.c_od_e.pagination.view.networkanddb;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/c_od_e/pagination/view/networkanddb/NetworkAndDbViewModel;", "Lcom/c_od_e/pagination/core/BaseViewModel;", "repository", "Lcom/c_od_e/pagination/data/CatsRepository;", "(Lcom/c_od_e/pagination/data/CatsRepository;)V", "dataSource", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/c_od_e/pagination/model/Cat;", "getDataSource", "()Lkotlinx/coroutines/flow/Flow;", "app_debug"})
@androidx.paging.ExperimentalPagingApi()
public final class NetworkAndDbViewModel extends com.c_od_e.pagination.core.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.c_od_e.pagination.model.Cat>> dataSource = null;
    private final com.c_od_e.pagination.data.CatsRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.c_od_e.pagination.model.Cat>> getDataSource() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public NetworkAndDbViewModel(@org.jetbrains.annotations.NotNull()
    com.c_od_e.pagination.data.CatsRepository repository) {
        super();
    }
}