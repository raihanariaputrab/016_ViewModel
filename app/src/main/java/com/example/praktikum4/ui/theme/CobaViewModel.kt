package com.example.praktikum5.ui.theme

import androidx.compose.runtime.currentRecomposeScope
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.praktikum4.Data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel() {
    var namaUsr: String by mutableStateOf("")
        private set
    var noTelp: String by mutableStateOf("")
        private set
    var jenisKl: String by mutableStateOf("")
        private set
    var Alamat: String by mutableStateOf("")
        private set
    var Email: String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()

    fun insertData(nm: String, tlp: String, jk: String, almt: String, email: String){
        namaUsr = nm;
        noTelp = tlp;
        jenisKl = jk;
        Alamat = almt;
        Email = email;
    }

    fun setJenisK(pilihJK: String){
        _uiState.update { currentState -> currentState.copy(sex = pilihJK) }
    }

}