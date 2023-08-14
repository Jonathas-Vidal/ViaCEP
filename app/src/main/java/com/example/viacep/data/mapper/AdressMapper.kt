package com.example.viacep.data.mapper

import com.example.viacep.domain.model.Adress
import com.example.viacep.data.model.AdressResponse

//Converter as informações vindas da API para o model local.
fun AdressResponse.toDomain() : Adress {

    return Adress (
        cep = cep,
        logradouro = logradouro,
        complemento = complemento,
        bairro = bairro,
        localidade = localidade,
        uf = uf,
    )
}