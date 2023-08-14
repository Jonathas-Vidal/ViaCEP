package com.example.viacep.presenter.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.viacep.domain.model.Adress
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class ListViewModel @Inject constructor() : ViewModel() {

    private val _adressList = MutableLiveData<MutableList<Adress>>()
    val currentAddressList : LiveData<MutableList<Adress>> = _adressList

    fun insertAdress(address: Adress) {
        val currentList = _adressList.value ?: mutableListOf()
        currentList.add(address)
        _adressList.value = currentList
    }
}