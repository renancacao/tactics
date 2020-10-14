package com.rcacao.tactics.storage.data.soldier.mapper

import com.rcacao.tactics.core.data.soldier.Soldier
import com.rcacao.tactics.storage.data.soldier.database.SoldierDTO

interface SoldierMapper {

    fun mapSoldier(soldierDTO: SoldierDTO): Soldier
    fun mapSoldierDTO(soldier: Soldier): SoldierDTO

}