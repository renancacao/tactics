package com.rcacao.tactics.core.data.soldier.model

import com.rcacao.tactics.core.data.job.model.Job
import com.rcacao.tactics.core.domain.soldier.Sex
import com.rcacao.tactics.core.domain.soldier.StatsCalculatorHelper
import com.rcacao.tactics.core.domain.zodiac.Zodiac

class Soldier(
    val name: String,
    val zodiac: Zodiac,
    val sex: Sex,
    var brave: Int,
    var faith: Int,
    private val rawStats: RawStats,
    val job: Job
) {

    companion object {
        private val statsCalculatorHelper =
            StatsCalculatorHelper()
    }

    init {
        calculateStatus(job)
    }

    var stats: SoldierStats =
        SoldierStats(0, 0, 0, 0, 0)

    private fun calculateStatus(job: Job) {
        stats = statsCalculatorHelper.calculateStats(rawStats, job)
    }

}