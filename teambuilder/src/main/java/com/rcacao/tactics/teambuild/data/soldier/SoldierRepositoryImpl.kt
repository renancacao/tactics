package com.rcacao.tactics.teambuild.data.soldier

import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.core.data.job.model.Job
import com.rcacao.tactics.core.data.soldier.model.RawStats
import com.rcacao.tactics.core.data.soldier.model.Soldier
import com.rcacao.tactics.core.data.soldier.model.SoldierStats
import com.rcacao.tactics.teambuild.data.job.datasource.JobGameDataSource
import com.rcacao.tactics.teambuild.data.soldier.database.DBSoldier
import com.rcacao.tactics.teambuild.data.soldier.datasource.SoldierGameDataSource
import com.rcacao.tactics.teambuild.data.soldier.datasource.SoldierLocalDataSource

class SoldierRepositoryImpl(
    private val soldierGameDataSource: SoldierGameDataSource,
    private val soldierLocalDataSource: SoldierLocalDataSource,
    private val jobGameDataSource: JobGameDataSource
) : SoldierRepository {

    override suspend fun getRandomSoldier(job: Job): Result<Soldier> =
        soldierGameDataSource.randomSoldier(job)

    override suspend fun getSavedSoldiers(): Result<List<Soldier>> = try {
        when (val result: Result<List<DBSoldier>> = soldierLocalDataSource.getSavedSoldiers()) {
            is Result.Success -> Result.Success(result.data.map {
                Soldier(
                    it.id,
                    it.name,
                    it.zodiac,
                    it.sex,
                    it.brave,
                    it.faith,
                    RawStats(it.rawHp, it.rawMp, it.rawSpeed, it.rawPAtk, it.rawPMgk),
                    jobGameDataSource.getJob(it.jobId),
                    SoldierStats(it.hp, it.mp, it.sp, it.pa, it.ma)
                )
            })
            is Result.Error -> result
        }
    } catch (ex: Exception) {
        Result.Error(ex)
    }

}
