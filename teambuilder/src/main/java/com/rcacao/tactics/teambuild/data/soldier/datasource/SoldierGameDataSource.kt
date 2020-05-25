package com.rcacao.tactics.teambuild.data.soldier.datasource

import com.rcacao.tactics.core.data.soldier.Soldier

interface SoldierGameDataSource {
    suspend fun randomSoldier(): Soldier
}