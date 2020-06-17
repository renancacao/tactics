package com.rcacao.tactics.teambuild.data.soldier.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface SoldiersDao {

    @Query("SELECT * from soldiersData")
    suspend fun getAll(): List<DBSoldier>

    @Insert(onConflict = REPLACE)
    suspend fun insert(dbSoldier: DBSoldier): Long

    @Query("DELETE from soldiersData")
    suspend fun deleteAll()

    @Query("DELETE from soldiersData where id=:id")
    suspend fun deleteById(id: Int)

}