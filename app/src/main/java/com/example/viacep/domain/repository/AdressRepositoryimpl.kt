package com.example.viacep.domain.repository

import com.example.viacep.data.api.ServiceApi
import com.example.viacep.data.model.AdressResponse
import com.example.viacep.data.repository.AdressRepository
import javax.inject.Inject


class AdressRepositoryimpl @Inject constructor(
    private val serviceApi : ServiceApi
) : AdressRepository {

    override suspend fun getAdress(cep: String): AdressResponse {
        return serviceApi.getAddress(cep)
    }

}