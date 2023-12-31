package com.example.viacep.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/example/viacep/data/api/ServiceApi;", "", "getAddress", "Lcom/example/viacep/data/model/AdressResponse;", "cep", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ServiceApi {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "{cep}/json")
    public abstract java.lang.Object getAddress(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "cep")
    java.lang.String cep, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.viacep.data.model.AdressResponse> continuation);
}