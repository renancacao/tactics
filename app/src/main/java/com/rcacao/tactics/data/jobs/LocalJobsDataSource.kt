package com.rcacao.tactics.data.jobs

class LocalJobsDataSource {

    fun jobs(): List<Job> {

        return listOf(
            Job(
                id = JobId.SQUIRE,
                name = "Squire",
                description = "This job serves as the foundation for all others, forming the first step on the road to becoming a legendary warrior.",
                move = 4,
                jump = 3,
                speed = 6,
                pev = 0.05f,
                baseAttack = StatsMeasure.LOW,
                baseMagick = StatsMeasure.VERY_LOW,
                baseHP = StatsMeasure.MEDIUM,
                baseMP = StatsMeasure.VERY_LOW
            ),
            Job(
                id = JobId.CHEMIST,
                name = "Chemist",
                description = "An expert in the use of items to recover HP or remove vexing status ailments.",
                move = 3,
                jump = 3,
                speed = 8,
                pev = 0.05f,
                baseAttack = StatsMeasure.LOW,
                baseMagick = StatsMeasure.AVERAGE,
                baseHP = StatsMeasure.LOW,
                baseMP = StatsMeasure.AVERAGE
            )
        )
    }

}