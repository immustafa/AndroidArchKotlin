package com.imgego.androidarchkotlin.di

import com.imgego.androidarchkotlin.network.ApiClient
import com.imgego.androidarchkotlin.network.PublicApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideApi(client: ApiClient): PublicApi {
        return client.buildApi(PublicApi::class.java)
    }


}