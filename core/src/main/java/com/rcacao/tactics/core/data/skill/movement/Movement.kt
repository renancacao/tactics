package com.rcacao.tactics.core.data.skill.movement

import com.rcacao.tactics.core.data.skill.Skill
import com.rcacao.tactics.core.data.stats.StatsChange

class Movement(
    override val id: Int,
    override val name: String,
    override val description: String,
    override val jp: Int,
    val statsChange: List<StatsChange> = emptyList()
) : Skill