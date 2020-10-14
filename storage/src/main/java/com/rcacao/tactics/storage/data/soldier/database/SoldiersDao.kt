package com.rcacao.tactics.storage.data.soldier.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface SoldiersDao {

    @Query("SELECT * from tab_soldiers")
    suspend fun getAll(): List<SoldierDTO>

    @Insert(onConflict = REPLACE)
    suspend fun insert(soldierDTO: SoldierDTO): Long

    @Query("DELETE from tab_soldiers")
    suspend fun deleteAll()

    @Query("DELETE from tab_soldiers where id=:id")
    suspend fun deleteById(id: Int)

}