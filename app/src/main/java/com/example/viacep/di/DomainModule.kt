package com.example.viacep.di

import com.example.viacep.data.repository.AdressRepository
import com.example.viacep.domain.repository.AdressRepositoryimpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class DomainModule {

    @Binds
    abstract fun bindsAdressRepositoryImpl(
        adressRepositoryimpl: AdressRepositoryimpl
    ) : AdressRepository
}