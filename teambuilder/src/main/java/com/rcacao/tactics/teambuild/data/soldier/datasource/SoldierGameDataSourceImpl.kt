package com.rcacao.tactics.teambuild.data.soldier.datasource

import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.core.data.job.model.Job
import com.rcacao.tactics.core.data.soldier.model.RawStats
import com.rcacao.tactics.core.data.soldier.model.Soldier
import com.rcacao.tactics.core.domain.soldier.Sex
import com.rcacao.tactics.core.domain.zodiac.Zodiac
import javax.inject.Inject
import kotlin.random.Random

class SoldierGameDataSourceImpl @Inject constructor(
    private val nameHelper: NameHelper,
    private val rawStatsHelper: RawStatsHelper,
    private val statsCalculatorHelper: StatsCalculatorHelper
) : SoldierGameDataSource {

    private val initBraveAndFaith: Int = 40
    private val finalBraveAndFaith: Int = 70

    override suspend fun randomSoldier(job: Job): Result<Soldier> {
        return try {
            val sex: Sex = randomSex()
            val rawStats: RawStats = rawStatsHelper.getRawStats(sex)
            Result.Success(
                Soldier(
                    null,
                    nameHelper.getRandomName(sex),
                    randomZodiac(),
                    sex,
                    randomBraveOrFaith(),
                    randomBraveOrFaith(),
                    rawStats,
                    job,
                    statsCalculatorHelper.calculateStats(rawStats, job)
                )
            )
        } catch (ex: Exception) {
            Result.Error(ex)
        }
    }

    private fun randomZodiac(): Zodiac {
        return Zodiac.values()[Random.nextInt(0, Zodiac.values().size)]
    }

    private fun randomSex(): Sex {
        return Sex.values()[Random.nextInt(0, Sex.values().size)]
    }

    private fun randomBraveOrFaith(): Int {
        return Random.nextInt(initBraveAndFaith, finalBraveAndFaith + 1)
    }

}