package com.c_od_e.pagination.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0004H\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\nH\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/c_od_e/pagination/di/NetworkModule;", "", "()V", "provideAuthInterceptor", "Lokhttp3/Interceptor;", "provideLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "provideOkHttp", "Lokhttp3/Call$Factory;", "loggingInterceptor", "authInterceptor", "provideRetrofit", "Lretrofit2/Retrofit;", "moshi", "callFactory", "provideSiliconApi", "Lcom/c_od_e/pagination/network/CatApi;", "retrofit", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.c_od_e.pagination.di.NetworkModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi, @org.jetbrains.annotations.NotNull()
    okhttp3.Call.Factory callFactory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.c_od_e.pagination.network.CatApi provideSiliconApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.Call.Factory provideOkHttp(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor loggingInterceptor, @org.jetbrains.annotations.NotNull()
    @AuthInterceptor()
    okhttp3.Interceptor authInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor provideLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @AuthInterceptor()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.Interceptor provideAuthInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.squareup.moshi.Moshi provideMoshi() {
        return null;
    }
    
    private NetworkModule() {
        super();
    }
}