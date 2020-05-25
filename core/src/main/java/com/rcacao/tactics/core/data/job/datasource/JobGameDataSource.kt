package com.rcacao.tactics.core.data.job.datasource

import com.rcacao.tactics.core.data.job.Job
import com.rcacao.tactics.core.data.job.JobId
import com.rcacao.tactics.core.data.stats.StatsMeasure

class JobGameDataSource(
    private val squireSkillHelper: JobSkillHelper,
    private val chemistSkillHelper: JobSkillHelper,
    private val archerSkillHelper: JobSkillHelper
) {

    fun getJobs(): List<Job> {
        return listOf(
            Job(
                JobId.SQUIRE,
                "Squire",
                "This job serves as the foundation for all others, forming the first step on the road to becoming a legendary warrior.",
                4,
                3,
                6,
                0.05f,
                baseAttack = StatsMeasure.LOW,
                baseMagick = StatsMeasure.VERY_LOW,
                baseHP = StatsMeasure.MEDIUM,
                baseMP = StatsMeasure.VERY_LOW,
                skills = squireSkillHelper.getSkills()
            ),
            Job(
                JobId.CHEMIST,
                "Chemist",
                "An expert in the use of items to recover HP or remove vexing status ailments.",
                3,
                3,
                8,
                0.05f,
                baseAttack = StatsMeasure.LOW,
                baseMagick = StatsMeasure.AVERAGE,
                baseHP = StatsMeasure.LOW,
                baseMP = StatsMeasure.AVERAGE,
                skills = chemistSkillHelper.getSkills()
            ),
            Job(
                JobId.ARCHER,
                "Archer",
                "Equipped with a bow and arrow, this warrior provides valuable long-range attacks. May Aim for higher damage.",
                3,
                3,
                8,
                0.1f,
                baseAttack = StatsMeasure.AVERAGE,
                baseMagick = StatsMeasure.LOW,
                baseHP = StatsMeasure.AVERAGE,
                baseMP = StatsMeasure.LOW,
                skills = archerSkillHelper.getSkills()
            )
        )
    }

}