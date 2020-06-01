package com.rcacao.tactics.teambuild.data.soldier.datasource

import com.rcacao.tactics.core.data.soldier.model.RawStats
import com.rcacao.tactics.core.domain.soldier.Sex
import kotlin.random.Random

class RawStatsHelperImpl : RawStatsHelper {

    private val speed = 98304

    private val pAtkMale = 81920
    private val pMgkMale = 65536
    private val initHpMale = 491520
    private val finalHpMale = 524287
    private val initMpMale = 229376
    private val finalMpMale = 245759

    private val pAtkFemale = 65536
    private val pMgkFemale = 81920
    private val initHpFemale = 458752
    private val finalHpFemale = 491519
    private val initMpFemale = 245760
    private val finalMpFemale = 262143

    override fun getRawStats(sex: Sex): RawStats =
        RawStats(
            getRawHP(sex),
            getRawMP(sex),
            getRawSpeed(sex),
            getRawPAtk(sex),
            getRawPMgk(sex)
        )

    private fun getRawSpeed(sex: Sex): Int {
        return when (sex) {
            Sex.MALE -> speed
            Sex.FEMALE -> speed
        }
    }

    private fun getRawPAtk(sex: Sex): Int {
        return when (sex) {
            Sex.MALE -> pAtkMale
            Sex.FEMALE -> pAtkFemale
        }
    }

    private fun getRawPMgk(sex: Sex): Int {
        return when (sex) {
            Sex.MALE -> pMgkMale
            Sex.FEMALE -> pMgkFemale
        }
    }

    private fun getRawHP(sex: Sex): Int {
        return when (sex) {
            Sex.MALE -> Random.nextInt(initHpMale, finalHpMale)
            Sex.FEMALE -> Random.nextInt(initHpFemale, finalHpFemale)
        }
    }

    private fun getRawMP(sex: Sex): Int {
        return when (sex) {
            Sex.MALE -> Random.nextInt(initMpMale, finalMpMale)
            Sex.FEMALE -> Random.nextInt(initMpFemale, finalMpFemale)
        }
    }

}