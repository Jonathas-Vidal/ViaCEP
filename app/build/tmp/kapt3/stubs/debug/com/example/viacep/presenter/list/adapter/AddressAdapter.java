package com.example.viacep.presenter.list.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/example/viacep/presenter/list/adapter/AddressAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/viacep/domain/model/Adress;", "Lcom/example/viacep/presenter/list/adapter/AddressAdapter$ViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "app_debug"})
public final class AddressAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.viacep.domain.model.Adress, com.example.viacep.presenter.list.adapter.AddressAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    public static final com.example.viacep.presenter.list.adapter.AddressAdapter.Companion Companion = null;
    
    public AddressAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.viacep.presenter.list.adapter.AddressAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.viacep.presenter.list.adapter.AddressAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/viacep/presenter/list/adapter/AddressAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/viacep/databinding/ItemAddressBinding;", "(Lcom/example/viacep/presenter/list/adapter/AddressAdapter;Lcom/example/viacep/databinding/ItemAddressBinding;)V", "getBinding", "()Lcom/example/viacep/databinding/ItemAddressBinding;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.viacep.databinding.ItemAddressBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.example.viacep.databinding.ItemAddressBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.viacep.databinding.ItemAddressBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/viacep/presenter/list/adapter/AddressAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/viacep/presenter/list/adapter/AddressAdapter$Companion$DIFF_CALLBACK;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/viacep/domain/model/Adress;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
        public static final class DIFF_CALLBACK extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.viacep.domain.model.Adress> {
            @org.jetbrains.annotations.NotNull
            public static final com.example.viacep.presenter.list.adapter.AddressAdapter.Companion.DIFF_CALLBACK INSTANCE = null;
            
            private DIFF_CALLBACK() {
                super();
            }
            
            @java.lang.Override
            public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
            com.example.viacep.domain.model.Adress oldItem, @org.jetbrains.annotations.NotNull
            com.example.viacep.domain.model.Adress newItem) {
                return false;
            }
            
            @java.lang.Override
            public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
            com.example.viacep.domain.model.Adress oldItem, @org.jetbrains.annotations.NotNull
            com.example.viacep.domain.model.Adress newItem) {
                return false;
            }
        }
    }
}