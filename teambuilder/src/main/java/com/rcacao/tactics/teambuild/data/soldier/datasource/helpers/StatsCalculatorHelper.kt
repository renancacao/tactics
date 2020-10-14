package com.rcacao.tactics.teambuild.data.soldier.datasource.helpers

import com.rcacao.tactics.core.data.job.jobs.Job
import com.rcacao.tactics.core.data.soldier.RawStats
import com.rcacao.tactics.core.data.soldier.SoldierStats

interface StatsCalculatorHelper {
    fun calculateStats(rawStats: RawStats, job: Job): SoldierStats
}