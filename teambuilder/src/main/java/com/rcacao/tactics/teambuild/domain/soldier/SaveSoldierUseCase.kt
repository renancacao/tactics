package com.rcacao.tactics.teambuild.domain.soldier

import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.core.data.soldier.model.Soldier
import com.rcacao.tactics.teambuild.data.soldier.SoldierRepository
import javax.inject.Inject

class SaveSoldierUseCase @Inject constructor(private val soldierRepository: SoldierRepository) {
    suspend operator fun invoke(soldier: Soldier): Result<Long> =
        soldierRepository.saveSoldier(soldier)
}