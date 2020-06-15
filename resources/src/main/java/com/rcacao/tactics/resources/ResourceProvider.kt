package com.rcacao.tactics.resources

import com.rcacao.tactics.core.domain.job.JobId
import com.rcacao.tactics.core.domain.soldier.Sex

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

}