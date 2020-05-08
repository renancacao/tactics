package com.rcacao.tactics.data.jobs

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
    val baseMP: StatsMeasure
) {
    lateinit var skills: JobSkill
}

