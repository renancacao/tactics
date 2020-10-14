package com.rcacao.tactics.storage.data.soldier.datasource

import com.rcacao.tactics.core.data.soldier.Soldier
import com.rcacao.tactics.storage.data.soldier.database.SoldiersDataBase
import com.rcacao.tactics.storage.data.soldier.mapper.SoldierMapper
import javax.inject.Inject

class SoldierLocalDataSourceImpl @Inject constructor(
    private val soldiersDataBase: SoldiersDataBase,
    private val soldierMapper: SoldierMapper
) : SoldierLocalDataSource {

    override suspend fun soldiersList(): List<Soldier> =
        soldiersDataBase.soldiersDao().getAll().map { soldierMapper.mapSoldier(it) }

    override suspend fun saveSoldier(soldier: Soldier): Long =
        soldiersDataBase.soldiersDao().insert(soldierMapper.mapSoldierDTO(soldier))

}
