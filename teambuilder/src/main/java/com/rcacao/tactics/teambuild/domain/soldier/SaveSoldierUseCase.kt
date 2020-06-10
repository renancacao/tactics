package com.rcacao.tactics.teambuild.domain.soldier

import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.core.data.soldier.model.Soldier
import com.rcacao.tactics.teambuild.data.soldier.SoldierRepository

class SaveSoldierUseCase(private val soldierRepository: SoldierRepository) {
    suspend operator fun invoke(soldier: Soldier): Result<Any> =
        soldierRepository.saveSoldier(soldier)
}