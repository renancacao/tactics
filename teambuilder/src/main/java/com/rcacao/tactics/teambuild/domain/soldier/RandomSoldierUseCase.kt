package com.rcacao.tactics.teambuild.domain.soldier

import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.core.data.job.Job
import com.rcacao.tactics.core.data.soldier.Soldier
import com.rcacao.tactics.teambuild.data.soldier.SoldierRepository

class RandomBaseSoldierUseCase(
    private val repository: SoldierRepository,
    private val initialJobUseCase: InitialJobUseCase
) {
    suspend fun invoke(): Result<Soldier> {
        return when (val result: Result<Job> = initialJobUseCase()) {
            is Result.Success -> repository.getRandomSoldier(result.data)
            is Result.Error -> result;
        }
    }
}