package com.mbahrami900913.mb_digikala_clone.ui.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mbahrami900913.mb_digikala_clone.data.model.Slider
import com.mbahrami900913.mb_digikala_clone.data.remote.NetworkResult
import com.mbahrami900913.mb_digikala_clone.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val homerRepo: HomeRepository) : ViewModel() {

    val slider = MutableStateFlow<NetworkResult<List<Slider>>>(NetworkResult.Loading())

    fun getSlider(){
        viewModelScope.launch {
            slider.emit(homerRepo.getSlider())
        }
    }

}