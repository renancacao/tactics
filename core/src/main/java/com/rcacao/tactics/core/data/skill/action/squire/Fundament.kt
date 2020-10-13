package com.rcacao.tactics.core.data.skill.action.squire

import com.rcacao.tactics.core.data.damage.DamageCalculation
import com.rcacao.tactics.core.data.damage.DamageFormula
import com.rcacao.tactics.core.data.skill.action.Action
import com.rcacao.tactics.core.data.skill.action.Range
import com.rcacao.tactics.core.data.skill.action.Type
import com.rcacao.tactics.core.data.skill.action.VerticalRange
import com.rcacao.tactics.core.data.skill.effects.OtherEffects
import com.rcacao.tactics.core.data.stats.StatsChange
import com.rcacao.tactics.core.data.status.StatusEffect

open class Fundament(
    id: FundamentId,
    name: String,
    description: String,
    jp: Int,
    range: Range,
    verticalRange: VerticalRange,
    casterTarget: Boolean,
    val type: Type,
    val damageCalculation: DamageCalculation,
    val damageFormula: DamageFormula,
    val evade: Boolean,
    statsChange: List<StatsChange> = emptyList(),
    otherEffects: List<OtherEffects> = emptyList(),
    statusEffects: List<StatusEffect> = emptyList()
) : Action(
    id = id,
    name = name,
    description = description,
    jp = jp,
    range = range,
    verticalRange = verticalRange,
    casterTarget = casterTarget,
    speed = 0,
    successRate = 100,
    mp = 0,
    statsChange = statsChange,
    otherEffects = otherEffects,
    statusEffects = statusEffects
)