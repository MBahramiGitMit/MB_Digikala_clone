package com.mbahrami900913.mb_digikala_clone.data.remote

import com.mbahrami900913.mb_digikala_clone.data.model.ResponseResult
import com.mbahrami900913.mb_digikala_clone.data.model.Slider
import retrofit2.Response
import retrofit2.http.GET

interface HomeApiService {
    @GET
    suspend fun getSlider() : Response<ResponseResult<List<Slider>>>
}