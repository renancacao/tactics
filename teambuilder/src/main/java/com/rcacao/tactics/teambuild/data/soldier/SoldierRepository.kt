package com.rcacao.tactics.teambuild.data.soldier

import com.rcacao.tactics.core.data.soldier.Soldier

interface SoldierRepository {
    suspend fun getRandomSoldier(): Soldier
}

