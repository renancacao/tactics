package com.rcacao.tactics.data.skills.reactions

import com.rcacao.tactics.data.skills.Skill
import com.rcacao.tactics.data.skills.Stats
import com.rcacao.tactics.data.skills.StatsChange
import com.rcacao.tactics.data.skills.Target

sealed class Reaction(
    override val id: Int,
    override val name: String,
    override val description: String,
    override val jp: Int,
    val reactionTrigger: ReactionTrigger,
    val statsChange: List<StatsChange> = emptyList()
) : Skill {

    object CounterTackle : Reaction(
        1,
        "Counter Tackle",
        "Counter attack with a tackle. (Rush)",
        180,
        ReactionTrigger.PHYSICAL_ATTACK
    )

    object AutoPotion : Reaction(
        2,
        "Auto Potion",
        "Use a Potion to restore HP.",
        400,
        ReactionTrigger.HP_LOSS
    )

    object AdrenalineRush : Reaction(
        3,
        "Adrenaline Rush",
        "Increase Speed.",
        900,
        ReactionTrigger.HP_LOSS,
        listOf(StatsChange(Stats.SPEED, 1, Target.CASTER))
    )

    object ArcherBane : Reaction(
        4,
        "Archer's Bane",
        "Dodge arrow and bolt attacks.",
        450,
        ReactionTrigger.BOW_ATTACK
    )

}