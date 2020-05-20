package com.rcacao.tactics.data.jobs

abstract class Job(
    val id: Int,
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

    val skills: JobSkill by lazy { loadSkills() }

    abstract fun loadSkills(): JobSkill

}

