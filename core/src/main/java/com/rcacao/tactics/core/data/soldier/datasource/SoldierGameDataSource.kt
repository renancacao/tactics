package com.rcacao.tactics.core.data.soldier.datasource

import com.rcacao.tactics.core.data.soldier.Sex
import com.rcacao.tactics.core.data.soldier.Soldier
import com.rcacao.tactics.core.data.zodiac.Zodiac
import kotlin.random.Random

class SoldierGameDataSource(private val nameHelper: SoldierNameHelper) {

    private val initBraveAndFaith: Int = 40
    private val finalBraveAndFaith: Int = 70

    fun randomSoldier(): Soldier {
        val sex: Sex = randomSex()
        return Soldier(
            nameHelper.getRandomName(sex),
            randomZodiac(),
            sex,
            randomBraveOrFaith(),
            randomBraveOrFaith()
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