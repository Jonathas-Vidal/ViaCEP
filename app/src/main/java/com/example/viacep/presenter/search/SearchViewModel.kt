package com.example.viacep.presenter.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.viacep.domain.usecase.GetAdressUseCase
import com.example.viacep.util.StateView
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import java.lang.Exception
import javax.inject.Inject


@HiltViewModel
class SearchViewModel @Inject constructor(
    private val getAdressUseCase: GetAdressUseCase
) : ViewModel() {

    fun getAdress(cep: String) = liveData(Dispatchers.IO) {
        try {
            emit(StateView.Loading())

            val address = getAdressUseCase(cep)
            emit(StateView.Success(address))
        } catch (e: Exception) {

            e.printStackTrace()
            emit(StateView.Error(message = e.message))
        }
    }
}