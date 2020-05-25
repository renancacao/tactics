package com.rcacao.tactics.teambuild.domain.soldier

import com.rcacao.tactics.core.data.soldier.Soldier
import com.rcacao.tactics.teambuild.data.soldier.SoldierRepository

class RandomSoldierUseCase(private val repository: SoldierRepository) {
    suspend fun invoke(): Soldier = repository.getRandomSoldier()
}