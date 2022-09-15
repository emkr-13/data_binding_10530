package com.example.data_binding_10530

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val currentRandomFruitName: LiveData<String>
        get() = FakeRepository.currentRandomFruitName

    fun onChangeRandomFruitClick() = FakeRepository.changeCurrentRandomFruitName()

    val editTextContext = MutableLiveData<String>()

    private val _displayedEditTextContent = MutableLiveData<String>()
    val displayedEditTextContent : LiveData<String>
    get()= _displayedEditTextContent

    fun onDisplayEditTextContentClick(){
        _displayedEditTextContent.value=editTextContext.value

    }

    fun onSelectRandomEditTextFruit(){
        editTextContext.value =FakeRepository.getRandomfruitname()
    }

}