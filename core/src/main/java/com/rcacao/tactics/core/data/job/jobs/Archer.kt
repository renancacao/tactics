package com.rcacao.tactics.core.data.job.jobs

import com.rcacao.tactics.core.data.job.BaseStats
import com.rcacao.tactics.core.data.job.CStats
import com.rcacao.tactics.core.data.job.JobId
import com.rcacao.tactics.core.data.job.JobSkill
import com.rcacao.tactics.core.data.skill.action.archer.*
import com.rcacao.tactics.core.data.skill.movement.archer.Jump1
import com.rcacao.tactics.core.data.skill.reaction.archer.AdrenalineRush
import com.rcacao.tactics.core.data.skill.reaction.archer.ArchersBane
import com.rcacao.tactics.core.data.skill.support.archer.Concentrate
import com.rcacao.tactics.core.data.skill.support.archer.EquipCrossbow

object Archer : Job(
    id = JobId.ARCHER,
    name = "Archer",
    description = "Equipped with a bow and arrow, this warrior provides valuable long-range attacks. May Aim for higher damage.",
    move = 3,
    jump = 3,
    pev = 10,

    baseStats = BaseStats(
        baseHP = 100,
        baseMP = 65,
        baseSpeed = 100,
        baseAttack = 110,
        baseMagick = 80
    ),
    cStats = CStats(
        cHP = 11,
        cMP = 16,
        cSpeed = 100,
        cAttack = 45,
        cMagick = 50
    ),
    skills = JobSkill(
        skillName = "Aim",
        skillDescription = "Archer job command. Allows attacks to be carefully aimed in order to deal greater damage.",
        actions = listOf(Aim1, Aim2, Aim3, Aim4, Aim5, Aim7, Aim10, Aim20),
        reactions = listOf(AdrenalineRush, ArchersBane),
        supports = listOf(EquipCrossbow, Concentrate),
        movements = listOf(Jump1)
    )
)

