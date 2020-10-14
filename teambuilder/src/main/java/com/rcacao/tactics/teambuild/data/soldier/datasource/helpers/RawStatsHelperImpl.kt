package com.rcacao.tactics.teambuild.data.soldier.datasource.helpers

import com.rcacao.tactics.core.data.soldier.RawStats
import com.rcacao.tactics.core.data.soldier.Sex
import javax.inject.Inject
import kotlin.random.Random

class RawStatsHelperImpl @Inject constructor() :
    RawStatsHelper {

    companion object {
        private const val SPEED = 98304

        private const val MALE_P_ATK = 81920
        private const val MALE_P_MGK = 65536
        private const val MALE_MIN_HP = 491520
        private const val MALE_MAX_HP = 524287
        private const val MALE_MIN_MP = 229376
        private const val MALE_MAX_MP = 245759

        private const val FEMALE_P_ATK = 65536
        private const val FEMALE_P_MGK = 81920
        private const val FEMALE_MIN_HP = 458752
        private const val FEMALE_MAX_HP = 491519
        private const val FEMALE_MIN_MP = 245760
        private const val FEMALE_MAX_MP = 262143
    }

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
            Sex.MALE -> SPEED
            Sex.FEMALE -> SPEED
        }
    }

    private fun getRawPAtk(sex: Sex): Int {
        return when (sex) {
            Sex.MALE -> MALE_P_ATK
            Sex.FEMALE -> FEMALE_P_ATK
        }
    }

    private fun getRawPMgk(sex: Sex): Int {
        return when (sex) {
            Sex.MALE -> MALE_P_MGK
            Sex.FEMALE -> FEMALE_P_MGK
        }
    }

    private fun getRawHP(sex: Sex): Int {
        return when (sex) {
            Sex.MALE -> Random.nextInt(
                MALE_MIN_HP,
                MALE_MAX_HP
            )
            Sex.FEMALE -> Random.nextInt(
                FEMALE_MIN_HP,
                FEMALE_MAX_HP
            )
        }
    }

    private fun getRawMP(sex: Sex): Int {
        return when (sex) {
            Sex.MALE -> Random.nextInt(
                MALE_MIN_MP,
                MALE_MAX_MP
            )
            Sex.FEMALE -> Random.nextInt(
                FEMALE_MIN_MP,
                FEMALE_MAX_MP
            )
        }
    }

}