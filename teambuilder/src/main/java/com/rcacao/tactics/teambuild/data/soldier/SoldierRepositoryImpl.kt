package com.rcacao.tactics.teambuild.data.soldier

import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.core.data.job.model.Job
import com.rcacao.tactics.core.data.soldier.model.RawStats
import com.rcacao.tactics.core.data.soldier.model.Soldier
import com.rcacao.tactics.core.data.soldier.model.SoldierStats
import com.rcacao.tactics.teambuild.data.job.datasource.JobDataSource
import com.rcacao.tactics.teambuild.data.soldier.database.DBSoldier
import com.rcacao.tactics.teambuild.data.soldier.datasource.SoldierGameDataSource
import com.rcacao.tactics.teambuild.data.soldier.datasource.SoldierLocalDataSource
import javax.inject.Inject

class SoldierRepositoryImpl @Inject constructor(
    private val soldierGameDataSource: SoldierGameDataSource,
    private val soldierLocalDataSource: SoldierLocalDataSource,
    private val jobGameDataSource: JobDataSource
) : SoldierRepository {

    override suspend fun getRandomSoldier(job: Job): Result<Soldier> =
        soldierGameDataSource.randomSoldier(job)

    override suspend fun getSavedSoldiers(): Result<List<Soldier>> = try {
        when (val result: Result<List<DBSoldier>> = soldierLocalDataSource.getSavedSoldiers()) {
            is Result.Success -> mapSoldiersList(result)
            is Result.Error -> result
        }
    } catch (ex: Exception) {
        Result.Error(ex)
    }

    private suspend fun mapSoldiersList(result: Result.Success<List<DBSoldier>>): Result<List<Soldier>> =
        try {

            val dbSoldiers: List<DBSoldier> = result.data
            val soldiers: ArrayList<Soldier> = ArrayList()

            dbSoldiers.forEach {
                when (val jobResult: Result<Job> = jobGameDataSource.getJob(it.jobId)) {
                    is Result.Success -> soldiers.add(mapSoldier(it, jobResult.data))
                    is Result.Error -> return jobResult
                }
            }

            Result.Success(soldiers)
        } catch (ex: Exception) {
            Result.Error(ex)
        }

    private fun mapSoldier(dbSoldier: DBSoldier, job: Job): Soldier =
        Soldier(
            dbSoldier.id,
            dbSoldier.name,
            dbSoldier.zodiac,
            dbSoldier.sex,
            dbSoldier.brave,
            dbSoldier.faith,
            RawStats(
                dbSoldier.rawHp,
                dbSoldier.rawMp,
                dbSoldier.rawSpeed,
                dbSoldier.rawPAtk,
                dbSoldier.rawPMgk
            ),
            job,
            SoldierStats(dbSoldier.hp, dbSoldier.mp, dbSoldier.sp, dbSoldier.pa, dbSoldier.ma)
        )

    override suspend fun saveSoldier(soldier: Soldier): Result<Any> =
        soldierLocalDataSource.saveSoldier(soldier.let {
            DBSoldier(
                it.id,
                it.name,
                it.zodiac,
                it.sex,
                it.brave,
                it.faith,
                it.rawStats.rawHp,
                it.rawStats.rawMp,
                it.rawStats.rawSpeed,
                it.rawStats.rawPAtk,
                it.rawStats.rawPMgk,
                it.job.id,
                it.stats.hp,
                it.stats.mp,
                it.stats.sp,
                it.stats.pa,
                it.stats.ma
            )
        })

}
