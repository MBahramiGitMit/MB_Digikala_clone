package com.mbahrami900913.mb_digikala_clone.di

import com.mbahrami900913.mb_digikala_clone.data.remote.HomeApiService
import com.mbahrami900913.mb_digikala_clone.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    internal fun provideInspector() =
        HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }

    @Singleton
    @Provides
    fun provideOkHttpClint(Interceptor: HttpLoggingInterceptor): OkHttpClient =
        OkHttpClient.Builder()
            .connectTimeout(Constants.TIMEOUT_SECOND, TimeUnit.SECONDS)
            .readTimeout(Constants.TIMEOUT_SECOND, TimeUnit.SECONDS)
            .writeTimeout(Constants.TIMEOUT_SECOND, TimeUnit.SECONDS)
            .addInterceptor(Interceptor)
            .build()

    @Singleton
    @Provides
    fun provideGson(): GsonConverterFactory = GsonConverterFactory.create()

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient, gsonConverter: GsonConverterFactory): Retrofit =
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(gsonConverter)
            .build()

    @Singleton
    @Provides
    fun provideHomeApiService(retrofit: Retrofit): HomeApiService = retrofit.create()
}