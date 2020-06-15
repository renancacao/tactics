package com.rcacao.tactics.teambuild.di

import com.rcacao.tactics.resources.ResourceProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@InstallIn(ApplicationComponent::class)
@Module
object MapperModule {

    @Provides
    fun provideResourceProvider(): ResourceProvider = ResourceProvider()

}