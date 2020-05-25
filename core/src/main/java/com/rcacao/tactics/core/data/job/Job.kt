package com.rcacao.tactics.core.data.job

import com.rcacao.tactics.core.data.stats.StatsMeasure

data class Job(
    val id: JobId,
    val name: String,
    val description: String,
    val move: Int,
    val jump: Int,
    val speed: Int,
    val pev: Float,
    val baseAttack: StatsMeasure,
    val baseMagick: StatsMeasure,
    val baseHP: StatsMeasure,
    val baseMP: StatsMeasure,
    val skills: JobSkill
)

