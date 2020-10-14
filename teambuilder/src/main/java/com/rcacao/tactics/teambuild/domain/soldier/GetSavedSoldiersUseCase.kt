package com.rcacao.tactics.teambuild.domain.soldier

import com.rcacao.tactics.core.data.soldier.Soldier
import com.rcacao.tactics.core.domain.Result
import com.rcacao.tactics.teambuild.data.soldier.repository.SoldierRepository
import javax.inject.Inject

class GetSavedSoldiersUseCase @Inject constructor(private val soldierRepository: SoldierRepository) {
    suspend operator fun invoke(): Result<List<Soldier>> =
        soldierRepository.soldiersList()
}
