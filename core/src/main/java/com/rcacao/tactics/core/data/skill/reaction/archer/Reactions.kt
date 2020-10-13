package com.rcacao.tactics.core.data.skill.reaction.archer

import com.rcacao.tactics.core.data.skill.SkillTarget
import com.rcacao.tactics.core.data.skill.reaction.Reaction
import com.rcacao.tactics.core.data.skill.reaction.ReactionId
import com.rcacao.tactics.core.data.skill.reaction.ReactionTrigger
import com.rcacao.tactics.core.data.stats.Stats
import com.rcacao.tactics.core.data.stats.StatsChange

object AdrenalineRush : Reaction(
    id = ReactionId.ADRENALINE_RUSH,
    name = "Adrenaline Rush",
    description = "Increase Speed.",
    jp = 900,
    reactionTrigger = ReactionTrigger.HP_LOSS,
    statsChange = listOf(
        StatsChange(
            stats = Stats.SPEED,
            value = 1,
            skillTarget = SkillTarget.CASTER
        )
    )
)

object ArchersBane : Reaction(
    id = ReactionId.ARCHERS_BANE,
    name = "Archer's Bane",
    description = "Dodge arrow and bolt attacks.",
    jp = 450,
    reactionTrigger = ReactionTrigger.BOW_ATTACK
)