package com.rcacao.tactics.teambuild.data.soldier.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [DBSoldier::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class SoldiersDataBase : RoomDatabase() {
    abstract fun soldiersDao(): SoldiersDao
}