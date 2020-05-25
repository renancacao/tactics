package com.rcacao.tactics.teambuild.data.soldier

import com.rcacao.tactics.core.data.soldier.Soldier
import com.rcacao.tactics.teambuild.data.soldier.datasource.SoldierGameDataSource

class SoldierRepositoryImpl(private val gameDataSource: SoldierGameDataSource) : SoldierRepository {

    override suspend fun getRandomSoldier(): Soldier {
        return gameDataSource.randomSoldier()
    }

}
