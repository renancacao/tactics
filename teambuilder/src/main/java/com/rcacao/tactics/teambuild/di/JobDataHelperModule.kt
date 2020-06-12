package com.rcacao.tactics.teambuild.di

import com.rcacao.tactics.teambuild.data.job.datasource.ArcherJobDataHelper
import com.rcacao.tactics.teambuild.data.job.datasource.ChemistJobDataHelper
import com.rcacao.tactics.teambuild.data.job.datasource.JobDataHelper
import com.rcacao.tactics.teambuild.data.job.datasource.SquireJobDataHelper
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