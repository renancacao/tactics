package com.rcacao.tactics.core.data.skill.action.chemist

import com.rcacao.tactics.core.data.skill.action.Action
import com.rcacao.tactics.core.data.skill.action.Range
import com.rcacao.tactics.core.data.skill.action.VerticalRange
import com.rcacao.tactics.core.data.skill.effects.OtherEffects
import com.rcacao.tactics.core.data.stats.StatsChange
import com.rcacao.tactics.core.data.status.StatusEffect

open class Item(
    id: ItemId,
    name: String,
    description: String,
    jp: Int,
    statsChange: List<StatsChange> = emptyList(),
    otherEffects: List<OtherEffects> = emptyList(),
    statusEffects: List<StatusEffect> = emptyList()
) : Action(
    id = id,
    name = name,
    description = description,
    jp = jp,
    range = Range.Item,
    verticalRange = VerticalRange.Item,
    casterTarget = true,
    speed = 0,
    successRate = 100,
    mp = 0,
    statsChange = statsChange,
    otherEffects = otherEffects,
    statusEffects = statusEffects
)
