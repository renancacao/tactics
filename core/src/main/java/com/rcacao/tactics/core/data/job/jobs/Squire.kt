package com.rcacao.tactics.core.data.job.jobs

import com.rcacao.tactics.core.data.job.BaseStats
import com.rcacao.tactics.core.data.job.CStats
import com.rcacao.tactics.core.data.job.JobId
import com.rcacao.tactics.core.data.job.JobSkill
import com.rcacao.tactics.core.data.skill.action.squire.Focus
import com.rcacao.tactics.core.data.skill.action.squire.Rush
import com.rcacao.tactics.core.data.skill.action.squire.Salve
import com.rcacao.tactics.core.data.skill.action.squire.Stone
import com.rcacao.tactics.core.data.skill.movement.squire.Move1
import com.rcacao.tactics.core.data.skill.reaction.squire.CounterTackle
import com.rcacao.tactics.core.data.skill.support.squire.Defend
import com.rcacao.tactics.core.data.skill.support.squire.EquipAxes
import com.rcacao.tactics.core.data.skill.support.squire.JpBoost

object Squire : Job(
    id = JobId.SQUIRE,
    name = "Squire",
    description = "This job serves as the foundation for all others, forming the first step on the road to becoming a legendary warrior.",
    move = 4,
    jump = 3,
    pev = 5,
    baseStats = BaseStats(
        baseHP = 100,
        baseMP = 75,
        baseSpeed = 100,
        baseAttack = 90,
        baseMagick = 80
    ),
    cStats = CStats(
        cHP = 11,
        cMP = 15,
        cSpeed = 100,
        cAttack = 60,
        cMagick = 50
    ),
    skills = JobSkill(
        skillName = "Fundaments",
        skillDescription = "Squire job command. These are the most fundamental of all battle techniques.",
        actions = listOf(Focus, Rush, Stone, Salve),
        reactions = listOf(CounterTackle),
        supports = listOf(EquipAxes, Defend, JpBoost),
        movements = listOf(Move1)
    )
)

