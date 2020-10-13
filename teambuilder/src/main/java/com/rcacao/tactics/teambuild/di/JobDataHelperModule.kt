package com.rcacao.tactics.teambuild.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@InstallIn(ApplicationComponent::class)
@Module
object JobDataHelperModule {

    @Provides
    fun provideJobDataHelperList(): MutableList<JobDataHelper> = mutableListOf(
        SquireJobDataHelper(),
        ChemistJobDataHelper(),
        ArcherJobDataHelper()
    )

}