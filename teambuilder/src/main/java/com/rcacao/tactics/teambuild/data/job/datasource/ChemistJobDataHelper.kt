package com.rcacao.tactics.teambuild.data.job.datasource

import com.rcacao.tactics.core.data.job.model.BaseStats
import com.rcacao.tactics.core.data.job.model.CStats
import com.rcacao.tactics.core.data.skill.action.model.Item
import com.rcacao.tactics.core.data.skill.movement.model.Movement
import com.rcacao.tactics.core.data.skill.reaction.model.Reaction
import com.rcacao.tactics.core.data.skill.support.model.Support
import com.rcacao.tactics.core.data.stats.model.StatsChange
import com.rcacao.tactics.core.data.status.model.StatusOperation
import com.rcacao.tactics.core.domain.job.JobId
import com.rcacao.tactics.core.domain.skill.SkillTarget
import com.rcacao.tactics.core.domain.skill.action.ItemId
import com.rcacao.tactics.core.domain.skill.reaction.ReactionTrigger
import com.rcacao.tactics.core.domain.stats.Stats
import com.rcacao.tactics.core.domain.stats.StatsChangeValue
import com.rcacao.tactics.core.domain.status.Status
import com.rcacao.tactics.core.domain.status.StatusEffect

class ChemistJobDataHelper : JobDataHelper(
    id = JobId.CHEMIST,
    name = "Chemist",
    description = "An expert in the use of items to recover HP or remove vexing status ailments.",
    move = 3,
    jump = 3,
    pev = 5,
    skillName = "Items",
    skillDescription = "Chemist job command. Enables the use of items to assist allies in need."
) {

    override fun getBaseStats(): BaseStats =
        BaseStats(
            baseHP = 80,
            baseMP = 75,
            baseSpeed = 100,
            baseAttack = 75,
            baseMagick = 80
        )

    override fun getCStats(): CStats =
        CStats(
            cHP = 12,
            cMP = 16,
            cSpeed = 100,
            cAttack = 75,
            cMagick = 50
        )

    override fun getActions(): List<Item> = listOf(
        Item(
            5,
            "Potion",
            "Use a potion to restore HP or inflict damage on the undead.",
            30,
            ItemId.POTION,
            statsChange = listOf(
                StatsChange(
                    Stats.HP,
                    30,
                    SkillTarget.TARGET
                )
            ),
            otherEffects = emptyList(),
            statusEffects = emptyList()
        ),
        Item(
            6,
            "Hi-Potion",
            "Use a Hi-Potion to restore HP. A more potent draught than a Potion.",
            200,
            ItemId.HI_POTION,
            statsChange = listOf(
                StatsChange(
                    Stats.HP,
                    70,
                    SkillTarget.TARGET
                )
            ),
            otherEffects = emptyList(),
            statusEffects = emptyList()
        ),
        Item(
            7,
            "X-Potion",
            "Use an X-Potion to restore HP. A more potent draught than a Hi-Potion.",
            300,
            ItemId.X_POTION,
            statsChange = listOf(
                StatsChange(
                    Stats.HP,
                    150,
                    SkillTarget.TARGET
                )
            ),
            otherEffects = emptyList(),
            statusEffects = emptyList()
        ),
        Item(
            8,
            "Phoenix Down",
            "Use phoenix down to restore life to a fallen unit. Vanishes after one use.",
            90,
            ItemId.PHOENIX_DOWN,
            statsChange = listOf(
                StatsChange(
                    Stats.HP,
                    StatsChangeValue.Random(1, 20),
                    SkillTarget.TARGET
                )
            ),
            otherEffects = emptyList(),
            statusEffects = listOf(
                StatusEffect(
                    Status.DEAD,
                    StatusOperation.REMOVE
                )
            )
        )
    )

    override fun getReactions(): List<Reaction> = listOf(
        Reaction(
            2,
            "Auto Potion",
            "Use a Potion to restore HP.",
            400,
            ReactionTrigger.HP_LOSS
        )
    )

    override fun getSupports(): List<Support> = listOf(
        Support(
            4,
            "Throw Item",
            "Throw items within an increased radius, even if not a Chemist.",
            350
        ),
        Support(
            5,
            "Safeguard",
            "Prevent equipment from being destroyed or stolen.",
            250
        ),
        Support(
            6,
            "Reequip",
            "Change equipment mid-battle. Adds the Reequip command.",
            0
        )
    )

    override fun getMovements(): List<Movement> = listOf(
        Movement(
            2,
            "Jump +1",
            "Increase Jump by 1.",
            200,
            listOf(
                StatsChange(
                    Stats.JUMP,
                    1,
                    SkillTarget.CASTER
                )
            )
        )
    )

}