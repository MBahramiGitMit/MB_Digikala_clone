package com.mbahrami900913.mb_digikala_clone.repository

import com.mbahrami900913.mb_digikala_clone.data.model.Slider
import com.mbahrami900913.mb_digikala_clone.data.remote.BaseApiResponse
import com.mbahrami900913.mb_digikala_clone.data.remote.HomeApiService
import com.mbahrami900913.mb_digikala_clone.data.remote.NetworkResult
import javax.inject.Inject

class HomeRepository @Inject constructor(private val homeApi: HomeApiService) : BaseApiResponse() {
    suspend fun getSlider(): NetworkResult<List<Slider>> = safeApiCall { homeApi.getSlider() }
}