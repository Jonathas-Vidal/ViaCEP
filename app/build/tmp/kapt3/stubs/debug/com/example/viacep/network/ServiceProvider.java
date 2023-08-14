package com.example.viacep.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/viacep/network/ServiceProvider;", "", "()V", "BASE_URL", "", "client", "Lokhttp3/OkHttpClient;", "retrofit", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "createService", "API", "apiClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "app_debug"})
public final class ServiceProvider {
    @org.jetbrains.annotations.NotNull
    public static final com.example.viacep.network.ServiceProvider INSTANCE = null;
    private static final java.lang.String BASE_URL = "https://viacep.com.br/ws/";
    private static final okhttp3.OkHttpClient client = null;
    private static final retrofit2.Retrofit retrofit = null;
    
    private ServiceProvider() {
        super();
    }
    
    public final <API extends java.lang.Object>API createService(@org.jetbrains.annotations.NotNull
    java.lang.Class<API> apiClass) {
        return null;
    }
}