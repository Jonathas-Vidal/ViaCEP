package com.example.viacep.presenter.search;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/viacep/presenter/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "getAdressUseCase", "Lcom/example/viacep/domain/usecase/GetAdressUseCase;", "(Lcom/example/viacep/domain/usecase/GetAdressUseCase;)V", "getAdress", "Landroidx/lifecycle/LiveData;", "Lcom/example/viacep/util/StateView;", "Lcom/example/viacep/domain/model/Adress;", "cep", "", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.viacep.domain.usecase.GetAdressUseCase getAdressUseCase = null;
    
    @javax.inject.Inject
    public SearchViewModel(@org.jetbrains.annotations.NotNull
    com.example.viacep.domain.usecase.GetAdressUseCase getAdressUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.viacep.util.StateView<com.example.viacep.domain.model.Adress>> getAdress(@org.jetbrains.annotations.NotNull
    java.lang.String cep) {
        return null;
    }
}