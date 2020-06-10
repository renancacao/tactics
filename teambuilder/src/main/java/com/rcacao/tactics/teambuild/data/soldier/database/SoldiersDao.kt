package com.rcacao.tactics.teambuild.data.soldier.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface SoldiersDao {

    @Query("SELECT * from soldiersData")
    fun getAll(): List<DBSoldier>

    @Insert(onConflict = REPLACE)
    fun insert(dbSoldier: DBSoldier)

    @Query("DELETE from soldiersData")
    fun deleteAll()

    @Query("DELETE from soldiersData where id=:id")
    fun deleteById(id: Int)

}