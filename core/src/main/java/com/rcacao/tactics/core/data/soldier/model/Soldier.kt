package com.rcacao.tactics.core.data.soldier.model

import com.rcacao.tactics.core.data.job.model.Job
import com.rcacao.tactics.core.domain.soldier.Sex
import com.rcacao.tactics.core.domain.zodiac.Zodiac

class Soldier(
    val id: Int?,
    val name: String,
    val zodiac: Zodiac,
    val sex: Sex,
    var brave: Int,
    var faith: Int,
    private val rawStats: RawStats,
    val job: Job,
    val stats: SoldierStats
) {
}