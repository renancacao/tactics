package com.rcacao.tactics.core.data.soldier

import com.rcacao.tactics.core.data.job.jobs.Job
import com.rcacao.tactics.core.data.zodiac.Zodiac

class Soldier(
    var id: Long?,
    val name: String,
    val zodiac: Zodiac,
    val sex: Sex,
    var brave: Int,
    var faith: Int,
    val rawStats: RawStats,
    val job: Job,
    val stats: SoldierStats
) {
}