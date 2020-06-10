package com.rcacao.tactics.teambuild.data.soldier.datasource

import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.teambuild.data.soldier.database.DBSoldier
import com.rcacao.tactics.teambuild.data.soldier.database.SoldiersDataBase

class SoldierLocalDataSourceImpl(private val soldiersDataBase: SoldiersDataBase) :
    SoldierLocalDataSource {

    override suspend fun getSavedSoldiers(): Result<List<DBSoldier>> = try {
        Result.Success(soldiersDataBase.soldiersDao().getAll())
    } catch (ex: Exception) {
        Result.Error(ex)
    }

}
