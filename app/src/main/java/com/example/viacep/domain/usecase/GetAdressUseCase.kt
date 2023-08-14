package com.example.viacep.domain.usecase

import com.example.viacep.domain.model.Adress
import com.example.viacep.data.mapper.toDomain
import com.example.viacep.data.repository.AdressRepository
import javax.inject.Inject

class GetAdressUseCase @Inject constructor(
    private val repository: AdressRepository
) {

    suspend operator fun invoke(cep:String) : Adress {
        return repository.getAdress(cep).toDomain()
    }
}