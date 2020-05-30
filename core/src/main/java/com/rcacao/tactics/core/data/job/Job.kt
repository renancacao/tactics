package com.rcacao.tactics.core.data.job

data class Job(
    val id: JobId,
    val name: String,
    val description: String,
    val move: Int,
    val jump: Int,
    val pev: Float,
    val baseStats: BaseStats,
    val cStats: CStats,
    val skills: JobSkill
)

