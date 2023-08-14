package com.example.viacep.presenter.list;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/example/viacep/presenter/list/ListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_adressList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/viacep/domain/model/Adress;", "currentAddressList", "Landroidx/lifecycle/LiveData;", "getCurrentAddressList", "()Landroidx/lifecycle/LiveData;", "insertAdress", "", "address", "app_debug"})
public final class ListViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.viacep.domain.model.Adress>> _adressList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.viacep.domain.model.Adress>> currentAddressList = null;
    
    @javax.inject.Inject
    public ListViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.viacep.domain.model.Adress>> getCurrentAddressList() {
        return null;
    }
    
    public final void insertAdress(@org.jetbrains.annotations.NotNull
    com.example.viacep.domain.model.Adress address) {
    }
}