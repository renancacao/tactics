package com.rcacao.tactics.core.data.soldier

import com.rcacao.tactics.core.data.job.Job
import com.rcacao.tactics.core.data.zodiac.Zodiac

class Soldier(
    val name: String,
    val zodiac: Zodiac,
    val sex: Sex,
    var brave: Int,
    var faith: Int,
    val rawStats: RawStats
) {

    companion object {
        private val statsCalculatorHelper = StatsCalculatorHelper()
    }

    var stats: SoldierStats = SoldierStats(0, 0, 0, 0, 0)

    var job: Job
        get() = job
        set(value) {
            job = value
            calculateStatus(job)
        }

    private fun calculateStatus(job: Job) {
        stats = statsCalculatorHelper.calculateStats(rawStats, job)
    }

}