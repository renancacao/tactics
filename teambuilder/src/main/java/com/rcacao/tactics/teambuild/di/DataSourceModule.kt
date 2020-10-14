package com.rcacao.tactics.teambuild.di

import com.rcacao.tactics.core.data.job.datasource.JobDataSource
import com.rcacao.tactics.core.data.job.datasource.JobGameDataSourceImpl
import com.rcacao.tactics.storage.data.soldier.datasource.SoldierLocalDataSource
import com.rcacao.tactics.storage.data.soldier.datasource.SoldierLocalDataSourceImpl
import com.rcacao.tactics.teambuild.data.soldier.datasource.RandomSoldierDataSource
import com.rcacao.tactics.teambuild.data.soldier.datasource.RandomSoldierDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@InstallIn(ApplicationComponent::class)
@Module
abstract class DataSourceModule {

    @Binds
    abstract fun bindSoldierGameDataSource(soldierGameDataSource: RandomSoldierDataSourceImpl): RandomSoldierDataSource

    @Binds
    abstract fun bindSoldierLocalDataSource(soldierLocalDataSource: SoldierLocalDataSourceImpl): SoldierLocalDataSource

    @Binds
    abstract fun bindJobDataSource(jobGameDataSource: JobGameDataSourceImpl): JobDataSource

}