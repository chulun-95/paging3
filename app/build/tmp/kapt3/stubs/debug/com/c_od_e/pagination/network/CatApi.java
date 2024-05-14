package com.c_od_e.pagination.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/c_od_e/pagination/network/CatApi;", "", "getCatImages", "", "Lcom/c_od_e/pagination/model/Cat;", "size", "", "order", "", "page", "(ILjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CatApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v1/images/search")
    public abstract java.lang.Object getCatImages(@retrofit2.http.Query(value = "limit")
    int size, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "order")
    java.lang.String order, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.c_od_e.pagination.model.Cat>> p3);
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}