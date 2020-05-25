package com.rcacao.tactics.core.data.skill.reaction

import com.rcacao.tactics.core.data.skill.Skill
import com.rcacao.tactics.core.data.stats.StatsChange

class Reaction(
    override val id: Int,
    override val name: String,
    override val description: String,
    override val jp: Int,
    val reactionTrigger: ReactionTrigger,
    val statsChange: List<StatsChange> = emptyList()
) : Skill