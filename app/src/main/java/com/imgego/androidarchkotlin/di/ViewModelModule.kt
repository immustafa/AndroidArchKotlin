package com.imgego.androidarchkotlin.di

import com.imgego.androidarchkotlin.data.entitites.artwork.ArtworkRepository
import com.imgego.androidarchkotlin.network.PublicApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent


@Module
@InstallIn(ViewModelComponent::class)
class ViewModelModule {

    @Provides
    fun provideArtworkRepository(apiService: PublicApi): ArtworkRepository = ArtworkRepository(apiService)
}