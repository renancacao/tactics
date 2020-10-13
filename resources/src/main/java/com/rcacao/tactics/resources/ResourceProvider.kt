package com.rcacao.tactics.resources

import com.rcacao.tactics.core.data.job.JobId
import com.rcacao.tactics.core.data.soldier.Sex
import com.rcacao.tactics.core.data.zodiac.Zodiac

class ResourceProvider {

    fun standPose(jobId: JobId, sex: Sex): Int = when (jobId) {
        JobId.SQUIRE -> squireStandPose(sex)
        JobId.CHEMIST -> chemistStandPose(sex)
        JobId.ARCHER -> archerStandPose(sex)
    }

    private fun archerStandPose(sex: Sex): Int = when (sex) {
        Sex.MALE -> R.drawable.tb_archer_male
        Sex.FEMALE -> R.drawable.tb_archer_female
    }

    private fun chemistStandPose(sex: Sex): Int = when (sex) {
        Sex.MALE -> R.drawable.tb_chemist_male
        Sex.FEMALE -> R.drawable.tb_chemist_female
    }

    private fun squireStandPose(sex: Sex): Int = when (sex) {
        Sex.MALE -> R.drawable.tb_squire_male
        Sex.FEMALE -> R.drawable.tb_squire_female
    }

    fun portrait(jobId: JobId, sex: Sex): Int = when (jobId) {
        JobId.SQUIRE -> squirePortrait(sex)
        JobId.CHEMIST -> chemistPortrait(sex)
        JobId.ARCHER -> archerPortrait(sex)
    }

    private fun squirePortrait(sex: Sex): Int = when (sex) {
        Sex.MALE -> R.drawable.fc_squire_male
        Sex.FEMALE -> R.drawable.fc_squire_female
    }

    private fun chemistPortrait(sex: Sex): Int = when (sex) {
        Sex.MALE -> R.drawable.fc_chemist_male
        Sex.FEMALE -> R.drawable.fc_chemist_female
    }

    private fun archerPortrait(sex: Sex): Int = when (sex) {
        Sex.MALE -> R.drawable.fc_archer_male
        Sex.FEMALE -> R.drawable.fc_archer_female
    }

    fun zodiacSymbol(zodiac: Zodiac): Int = when (zodiac) {
        Zodiac.ARIES -> R.drawable.z_aries
        Zodiac.TAURUS -> R.drawable.z_taurus
        Zodiac.GEMINI -> R.drawable.z_gemini
        Zodiac.CANCER -> R.drawable.z_cancer
        Zodiac.LEO -> R.drawable.z_leo
        Zodiac.VIRGO -> R.drawable.z_virgo
        Zodiac.LIBRA -> R.drawable.z_libra
        Zodiac.SCORPIO -> R.drawable.z_scorpio
        Zodiac.SAGITTARIUS -> R.drawable.z_sagittarius
        Zodiac.CAPRICORN -> R.drawable.z_capricorn
        Zodiac.AQUARIUS -> R.drawable.z_aquarius
        Zodiac.PISCES -> R.drawable.z_pisces
    }

}