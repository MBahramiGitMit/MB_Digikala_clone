package com.mbahrami900913.mb_digikala_clone.data.model

data class ResponseResult<T>(
    val message: String,
    val data: T,
    val success: Boolean
)