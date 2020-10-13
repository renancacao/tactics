package com.rcacao.tactics.core.data.job.jobs

import com.rcacao.tactics.core.data.job.BaseStats
import com.rcacao.tactics.core.data.job.CStats
import com.rcacao.tactics.core.data.job.JobId
import com.rcacao.tactics.core.data.job.JobSkill
import com.rcacao.tactics.core.data.skill.action.chemist.HiPotion
import com.rcacao.tactics.core.data.skill.action.chemist.PhoenixDown
import com.rcacao.tactics.core.data.skill.action.chemist.Potion
import com.rcacao.tactics.core.data.skill.action.chemist.XPotion
import com.rcacao.tactics.core.data.skill.movement.chemist.TreasureHunter
import com.rcacao.tactics.core.data.skill.reaction.chemist.AutoPotion
import com.rcacao.tactics.core.data.skill.support.chemist.Reequip
import com.rcacao.tactics.core.data.skill.support.chemist.SafeGuard
import com.rcacao.tactics.core.data.skill.support.chemist.ThrowItem

object Chemist : Job(
    id = JobId.CHEMIST,
    name = "Chemist",
    description = "An expert in the use of items to recover HP or remove vexing status ailments.",
    move = 3,
    jump = 3,
    pev = 5,
    baseStats = BaseStats(
        baseHP = 80,
        baseMP = 75,
        baseSpeed = 100,
        baseAttack = 75,
        baseMagick = 80
    ),
    cStats = CStats(
        cHP = 12,
        cMP = 16,
        cSpeed = 100,
        cAttack = 75,
        cMagick = 50
    ),
    skills = JobSkill(
        skillName = "Items",
        skillDescription = "Chemist job command. Enables the use of items to assist allies in need.",
        actions = listOf(Potion, HiPotion, XPotion, PhoenixDown),
        reactions = listOf(AutoPotion),
        supports = listOf(ThrowItem, SafeGuard, Reequip),
        movements = listOf(TreasureHunter)
    )
)

