package com.mbahrami900913.mb_digikala_clone.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mbahrami900913.mb_digikala_clone.data.datastrore.DataStoreRepository
import com.mbahrami900913.mb_digikala_clone.util.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@HiltViewModel
class DataStoreViewModel @Inject constructor(
    private val dataStoreRepo: DataStoreRepository
) : ViewModel() {

    fun saveUserLanguage(value: String) {
        viewModelScope.launch {
            dataStoreRepo.putString(key = Constants.USER_LANGUAGE_KEY, value = value)
        }
    }

    fun getUserLanguage(): String = runBlocking {
        dataStoreRepo.getString(key = Constants.USER_LANGUAGE_KEY) ?: Constants.PERSIAN_LANG
    }

}