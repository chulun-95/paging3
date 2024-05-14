package com.c_od_e.pagination.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0019R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001a"}, d2 = {"Lcom/c_od_e/pagination/core/BaseCatActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/c_od_e/pagination/view/adapter/CatsAdapter;", "getAdapter", "()Lcom/c_od_e/pagination/view/adapter/CatsAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/c_od_e/pagination/databinding/ActivityCatsBinding;", "getBinding", "()Lcom/c_od_e/pagination/databinding/ActivityCatsBinding;", "setBinding", "(Lcom/c_od_e/pagination/databinding/ActivityCatsBinding;)V", "viewModel", "Lcom/c_od_e/pagination/core/BaseViewModel;", "getViewModel", "()Lcom/c_od_e/pagination/core/BaseViewModel;", "handleError", "", "loadState", "Landroidx/paging/CombinedLoadStates;", "initAdapter", "isMediator", "", "app_debug"})
public abstract class BaseCatActivity extends androidx.appcompat.app.AppCompatActivity {
    public com.c_od_e.pagination.databinding.ActivityCatsBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy adapter$delegate = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.c_od_e.pagination.core.BaseViewModel getViewModel();
    
    @org.jetbrains.annotations.NotNull()
    public final com.c_od_e.pagination.databinding.ActivityCatsBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.c_od_e.pagination.databinding.ActivityCatsBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.c_od_e.pagination.view.adapter.CatsAdapter getAdapter() {
        return null;
    }
    
    public final void initAdapter(boolean isMediator) {
    }
    
    private final void handleError(androidx.paging.CombinedLoadStates loadState) {
    }
    
    public BaseCatActivity() {
        super();
    }
}