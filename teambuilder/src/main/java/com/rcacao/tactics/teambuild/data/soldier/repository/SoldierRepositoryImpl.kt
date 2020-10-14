package com.rcacao.tactics.teambuild.data.soldier.repository

import com.rcacao.tactics.core.data.job.jobs.Job
import com.rcacao.tactics.core.data.soldier.Soldier
import com.rcacao.tactics.core.domain.Result
import com.rcacao.tactics.storage.data.soldier.datasource.SoldierLocalDataSource
import com.rcacao.tactics.teambuild.data.soldier.datasource.RandomSoldierDataSource
import javax.inject.Inject

class SoldierRepositoryImpl @Inject constructor(
    private val randomSoldierDataSource: RandomSoldierDataSource,
    private val soldierLocalDataSource: SoldierLocalDataSource
) : SoldierRepository {

    override suspend fun randomSoldier(job: Job): Result<Soldier> =
        randomSoldierDataSource.randomSoldier(job)

    override suspend fun soldiersList(): Result<List<Soldier>> = try {
        Result.Success(soldierLocalDataSource.soldiersList())
    } catch (ex: Exception) {
        Result.Error(ex)
    }

    override suspend fun saveSoldier(soldier: Soldier): Result<Long> = try {
        Result.Success(soldierLocalDataSource.saveSoldier(soldier))
    } catch (ex: Exception) {
        Result.Error(ex)
    }

}
