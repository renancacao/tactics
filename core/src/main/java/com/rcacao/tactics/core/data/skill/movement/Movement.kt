package com.rcacao.tactics.core.data.skill.movement

import com.rcacao.tactics.core.data.skill.Skill
import com.rcacao.tactics.core.data.stats.StatsChange

open class Movement(
    override val id: MovementId,
    override val name: String,
    override val description: String,
    override val jp: Int,
    val statsChange: List<StatsChange> = emptyList()
) : Skill