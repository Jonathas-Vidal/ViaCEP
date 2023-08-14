package com.example.viacep.data.repository

import com.example.viacep.data.model.AdressResponse

interface AdressRepository {

    suspend fun getAdress(cep: String) : AdressResponse
}