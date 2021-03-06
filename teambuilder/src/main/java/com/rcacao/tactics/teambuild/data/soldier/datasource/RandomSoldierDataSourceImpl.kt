package com.rcacao.tactics.teambuild.data.soldier.datasource

import com.rcacao.tactics.core.data.job.jobs.Job
import com.rcacao.tactics.core.data.soldier.RawStats
import com.rcacao.tactics.core.data.soldier.Sex
import com.rcacao.tactics.core.data.soldier.Soldier
import com.rcacao.tactics.core.data.zodiac.Zodiac
import com.rcacao.tactics.core.domain.Result
import com.rcacao.tactics.teambuild.data.soldier.datasource.helpers.NameHelper
import com.rcacao.tactics.teambuild.data.soldier.datasource.helpers.RawStatsHelper
import com.rcacao.tactics.teambuild.data.soldier.datasource.helpers.StatsCalculatorHelper
import javax.inject.Inject
import kotlin.random.Random

class RandomSoldierDataSourceImpl @Inject constructor(
    private val nameHelper: NameHelper,
    private val rawStatsHelper: RawStatsHelper,
    private val statsCalculatorHelper: StatsCalculatorHelper
) : RandomSoldierDataSource {

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