package com.rcacao.tactics.teambuild.domain.soldier

import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.core.data.soldier.model.Soldier
import javax.inject.Inject

class AddNewSoldierUseCase @Inject constructor(
    private val randomBaseSoldier: RandomBaseSoldierUseCase,
    private val saveSoldier: SaveSoldierUseCase,
    private val getSavedSoldiers: GetSavedSoldiersUseCase
) {
    suspend operator fun invoke(): Result<List<Soldier>> =
        when (val result: Result<Soldier> = randomBaseSoldier()) {
            is Result.Success -> saveAndReturnSoldiers(result)
            is Result.Error -> result
        }

    private suspend fun saveAndReturnSoldiers(resultSoldier: Result.Success<Soldier>): Result<List<Soldier>> =
        when (val result: Result<Any> = saveSoldier(resultSoldier.data)) {
            is Result.Success -> getSavedSoldiers()
            is Result.Error -> result
        }

}