package com.rcacao.tactics.core.data.job.jobs

import com.rcacao.tactics.core.data.job.BaseStats
import com.rcacao.tactics.core.data.job.CStats
import com.rcacao.tactics.core.data.job.JobId
import com.rcacao.tactics.core.data.job.JobSkill

open class Job(
    val id: JobId,
    val name: String,
    val description: String,
    val move: Int,
    val jump: Int,
    val pev: Int,
    val baseStats: BaseStats,
    val cStats: CStats,
    val skills: JobSkill
)

