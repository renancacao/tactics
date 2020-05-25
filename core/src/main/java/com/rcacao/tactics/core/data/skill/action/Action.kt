package com.rcacao.tactics.core.data.skill.action

import com.rcacao.tactics.core.data.skill.Skill
import com.rcacao.tactics.core.data.stats.StatsChange
import com.rcacao.tactics.core.data.status.StatusEffect

abstract class Action(
    override val id: Int,
    override val name: String,
    override val description: String,
    override val jp: Int,
    val range: Range,
    val verticalRange: VerticalRange,
    val casterTarget: Boolean,
    val speed: Int,
    val successRate: Int,
    val mp: Int,
    val statsChange: List<StatsChange> = emptyList(),
    val otherEffects: List<OtherEffects> = emptyList(),
    val statusEffects: List<StatusEffect> = emptyList()
) : Skill