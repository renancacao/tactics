package com.rcacao.tactics.teambuild.di

import android.content.Context
import androidx.room.Room
import com.rcacao.tactics.teambuild.data.soldier.database.SoldiersDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
object DataBaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext: Context): SoldiersDataBase {
        return Room.databaseBuilder(
            appContext,
            SoldiersDataBase::class.java,
            "soldiers.db"
        ).build()
    }

}