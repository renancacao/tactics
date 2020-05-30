package com.rcacao.tactics.teambuild.data.soldier.datasource

import com.rcacao.tactics.core.data.soldier.Sex
import com.rcacao.tactics.core.data.soldier.Soldier
import com.rcacao.tactics.core.data.zodiac.Zodiac
import kotlin.random.Random

class SoldierGameDataSourceImpl(
    private val nameHelper: NameHelper,
    private val rawStatsHelper: RawStatsHelper
) : SoldierGameDataSource {

    private val initBraveAndFaith: Int = 40
    private val finalBraveAndFaith: Int = 70

    override suspend fun randomSoldier(): Soldier {
        val sex: Sex = randomSex()
        return Soldier(
            nameHelper.getRandomName(sex),
            randomZodiac(),
            sex,
            randomBraveOrFaith(),
            randomBraveOrFaith(),
            rawStatsHelper.getRawStats(sex)
        )
    }

    private fun randomZodiac(): Zodiac {
        return Zodiac.values()[Random.nextInt(0, Zodiac.values().size - 1)]
    }

    private fun randomSex(): Sex {
        return Sex.values()[Random.nextInt(0, Sex.values().size - 1)]
    }

    private fun randomBraveOrFaith(): Int {
        return Random.nextInt(initBraveAndFaith, finalBraveAndFaith)
    }

}