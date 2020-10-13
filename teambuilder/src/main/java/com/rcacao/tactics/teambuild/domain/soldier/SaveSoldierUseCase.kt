package com.rcacao.tactics.teambuild.domain.soldier

import com.rcacao.tactics.core.data.soldier.Soldier
import com.rcacao.tactics.core.domain.Result
import com.rcacao.tactics.teambuild.data.soldier.SoldierRepository
import javax.inject.Inject

class SaveSoldierUseCase @Inject constructor(private val soldierRepository: SoldierRepository) {
    suspend operator fun invoke(soldier: Soldier): Result<Long> =
        soldierRepository.saveSoldier(soldier)
}