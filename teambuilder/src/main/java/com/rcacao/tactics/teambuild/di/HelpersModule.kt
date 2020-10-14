package com.rcacao.tactics.teambuild.di

import com.rcacao.tactics.teambuild.data.soldier.datasource.helpers.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@InstallIn(ApplicationComponent::class)
@Module
abstract class HelpersModule {

    @Binds
    abstract fun bindNameHelper(nameHelper: NameHelperImpl): NameHelper

    @Binds
    abstract fun bindRawStateHelper(rawStatsHelper: RawStatsHelperImpl): RawStatsHelper

    @Binds
    abstract fun bindStatsCalculatorHelper(statsCalculatorHelper: StatsCalculatorHelperImpl): StatsCalculatorHelper

}