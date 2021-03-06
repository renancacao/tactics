package com.rcacao.tactics.teambuild.domain.soldier

import com.rcacao.tactics.core.data.job.jobs.Job
import com.rcacao.tactics.core.data.soldier.Soldier
import com.rcacao.tactics.core.domain.Result
import com.rcacao.tactics.teambuild.data.soldier.repository.SoldierRepository
import javax.inject.Inject

class RandomBaseSoldierUseCase @Inject constructor(
    private val repository: SoldierRepository,
    private val initialJobUseCase: InitialJobUseCase
) {
    suspend operator fun invoke(): Result<Soldier> =
        when (val result: Result<Job> = initialJobUseCase()) {
            is Result.Success -> repository.randomSoldier(result.data)
            is Result.Error -> result
        }
}