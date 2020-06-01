package com.rcacao.tactics.teambuild.data.job.datasource

import com.rcacao.tactics.core.data.job.model.BaseStats
import com.rcacao.tactics.core.data.job.model.CStats
import com.rcacao.tactics.core.data.skill.action.model.Aim
import com.rcacao.tactics.core.data.skill.movement.model.Movement
import com.rcacao.tactics.core.data.skill.reaction.model.Reaction
import com.rcacao.tactics.core.data.skill.support.model.Support
import com.rcacao.tactics.core.data.stats.model.StatsChange
import com.rcacao.tactics.core.domain.job.JobId
import com.rcacao.tactics.core.domain.skill.SkillTarget
import com.rcacao.tactics.core.domain.skill.reaction.ReactionTrigger
import com.rcacao.tactics.core.domain.stats.Stats

class ArcherJobDataHelper : JobDataHelper(
    id = JobId.ARCHER,
    name = "Archer",
    description = "Equipped with a bow and arrow, this warrior provides valuable long-range attacks. May Aim for higher damage.",
    move = 3,
    jump = 3,
    pev = 0.1f,
    skillName = "Aim",
    skillDescription = "Archer job command. Allows attacks to be carefully aimed in order to deal greater damage."
) {

    override fun getBaseStats(): BaseStats =
        BaseStats(
            baseHP = 100,
            baseMP = 65,
            baseSpeed = 100,
            baseAttack = 110,
            baseMagick = 80
        )

    override fun getCStats(): CStats =
        CStats(
            cHP = 11,
            cMP = 16,
            cSpeed = 100,
            cAttack = 45,
            cMagick = 50
        )

    override fun getActions(): List<Aim> = listOf(
        Aim(9, 100, 4, 1),
        Aim(9, 150, 5, 2),
        Aim(9, 200, 6, 3),
        Aim(9, 250, 8, 4),
        Aim(9, 300, 10, 5),
        Aim(9, 400, 14, 7),
        Aim(9, 700, 20, 10),
        Aim(9, 1200, 35, 20)
    )

    override fun getReactions(): List<Reaction> = listOf(
        Reaction(
            3,
            "Adrenaline Rush",
            "Increase Speed.",
            900,
            ReactionTrigger.HP_LOSS,
            listOf(
                StatsChange(
                    Stats.SPEED,
                    1,
                    SkillTarget.CASTER
                )
            )
        ),
        Reaction(
            4,
            "Archer's Bane",
            "Dodge arrow and bolt attacks.",
            450,
            ReactionTrigger.BOW_ATTACK
        )
    )

    override fun getSupports(): List<Support> = listOf(
        Support(
            7,
            "Equip Crossbows",
            "Equip crossbows, regardless of job.",
            350
        ),
        Support(
            8,
            "Concentrate",
            "Make attacks unblockable. If an enemy is in the targeted tile, it will always be a hit.",
            400
        )
    )

    override fun getMovements(): List<Movement> = listOf(
        Movement(
            1,
            "Move +1",
            "Increase Move by 1.",
            200,
            listOf(
                StatsChange(
                    Stats.MOVE,
                    1,
                    SkillTarget.CASTER
                )
            )
        )
    )

}