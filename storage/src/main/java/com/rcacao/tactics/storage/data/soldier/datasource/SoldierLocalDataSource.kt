package com.rcacao.tactics.storage.data.soldier.datasource

import com.rcacao.tactics.core.data.soldier.Soldier

interface SoldierLocalDataSource {
    suspend fun soldiersList(): List<Soldier>
    suspend fun saveSoldier(soldier: Soldier): Long
}
