package com.rcacao.tactics.teambuild.data.soldier.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [DBSoldier::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class SoldiersDataBase : RoomDatabase() {

    abstract fun soldiersDao(): SoldiersDao

    companion object {
        private var INSTANCE: SoldiersDataBase? = null

        fun getInstance(context: Context): SoldiersDataBase? {
            if (INSTANCE == null) {
                synchronized(SoldiersDataBase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        SoldiersDataBase::class.java, "soldiers.db"
                    ).build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}