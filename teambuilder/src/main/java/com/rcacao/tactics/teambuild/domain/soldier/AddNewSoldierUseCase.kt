package com.rcacao.tactics.teambuild.domain.soldier

import com.rcacao.tactics.core.data.soldier.Soldier
import com.rcacao.tactics.core.domain.Result
import javax.inject.Inject

class AddNewSoldierUseCase @Inject constructor(
    private val randomBaseSoldier: RandomBaseSoldierUseCase,
    private val saveSoldier: SaveSoldierUseCase
) {
    suspend operator fun invoke(): Result<Soldier> =
        when (val result: Result<Soldier> = randomBaseSoldier()) {
            is Result.Success -> saveAndReturnSoldier(result)
            is Result.Error -> result
        }

    private suspend fun saveAndReturnSoldier(soldierResult: Result.Success<Soldier>): Result<Soldier> =
        when (val saveResult: Result<Long> = saveSoldier(soldierResult.data)) {
            is Result.Success -> setIdAndReturnSoldier(soldierResult, saveResult)
            is Result.Error -> saveResult
        }

    private fun setIdAndReturnSoldier(
        soldierResult: Result.Success<Soldier>,
        saveResult: Result.Success<Long>
    ): Result.Success<Soldier> {
        val soldier: Soldier = soldierResult.data
        soldier.id = saveResult.data
        return Result.Success(soldier)
    }

}