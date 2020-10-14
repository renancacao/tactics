package com.rcacao.tactics.teambuild.di

import com.rcacao.tactics.teambuild.data.job.JobRepository
import com.rcacao.tactics.teambuild.data.job.JobRepositoryImpl
import com.rcacao.tactics.teambuild.data.soldier.repository.SoldierRepository
import com.rcacao.tactics.teambuild.data.soldier.repository.SoldierRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@InstallIn(ApplicationComponent::class)
@Module
abstract class RepositoryModule {

    @Binds
    abstract fun bindSoldierRepository(soldierRepositoryImpl: SoldierRepositoryImpl): SoldierRepository

    @Binds
    abstract fun bindJobRepository(jobRepositoryImpl: JobRepositoryImpl): JobRepository

}