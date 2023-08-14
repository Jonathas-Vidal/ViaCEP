package com.example.viacep.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Adress(
    val cep: String?,
    val logradouro: String?,
    val complemento: String?,
    val bairro: String?,
    val localidade: String?,
    val uf: String?,
) : Parcelable {

    fun getFullAdress() : String {
        return "$logradouro - $bairro\n $localidade/$uf - $cep"
    }
}
