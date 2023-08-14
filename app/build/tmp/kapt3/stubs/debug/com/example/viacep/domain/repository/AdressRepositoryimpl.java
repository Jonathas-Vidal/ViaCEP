package com.example.viacep.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/viacep/domain/repository/AdressRepositoryimpl;", "Lcom/example/viacep/data/repository/AdressRepository;", "serviceApi", "Lcom/example/viacep/data/api/ServiceApi;", "(Lcom/example/viacep/data/api/ServiceApi;)V", "getAdress", "Lcom/example/viacep/data/model/AdressResponse;", "cep", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AdressRepositoryimpl implements com.example.viacep.data.repository.AdressRepository {
    private final com.example.viacep.data.api.ServiceApi serviceApi = null;
    
    @javax.inject.Inject
    public AdressRepositoryimpl(@org.jetbrains.annotations.NotNull
    com.example.viacep.data.api.ServiceApi serviceApi) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAdress(@org.jetbrains.annotations.NotNull
    java.lang.String cep, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.viacep.data.model.AdressResponse> continuation) {
        return null;
    }
}