package com.mbahrami900913.mb_digikala_clone.di

import android.content.Context
import com.mbahrami900913.mb_digikala_clone.data.datastrore.DataStoreRepository
import com.mbahrami900913.mb_digikala_clone.data.datastrore.DataStoreRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataStoreModule {
    @Singleton
    @Provides
    fun provideDataStoreRepository(
        @ApplicationContext context: Context
    ): DataStoreRepository = DataStoreRepositoryImpl(context)
}