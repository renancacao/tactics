package com.rcacao.tactics.teambuild.data.soldier.datasource

import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.teambuild.data.soldier.database.DBSoldier

interface SoldierLocalDataSource {
    suspend fun getSavedSoldiers(): Result<List<DBSoldier>>
    suspend fun saveSoldier(soldier: DBSoldier): Result<Long>
}
