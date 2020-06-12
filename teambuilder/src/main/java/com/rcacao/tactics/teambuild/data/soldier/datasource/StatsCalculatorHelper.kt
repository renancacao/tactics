package com.rcacao.tactics.teambuild.data.soldier.datasource

import com.rcacao.tactics.core.data.job.model.Job
import com.rcacao.tactics.core.data.soldier.model.RawStats
import com.rcacao.tactics.core.data.soldier.model.SoldierStats

interface StatsCalculatorHelper {
    fun calculateStats(rawStats: RawStats, job: Job): SoldierStats
}