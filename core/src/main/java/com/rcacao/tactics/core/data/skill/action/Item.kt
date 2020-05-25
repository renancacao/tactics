package com.rcacao.tactics.core.data.skill.action

import com.rcacao.tactics.core.data.stats.StatsChange
import com.rcacao.tactics.core.data.status.StatusEffect

class Item(
    id: Int,
    name: String,
    description: String,
    jp: Int,
    val itemId: ItemId,
    statsChange: List<StatsChange>,
    otherEffects: List<OtherEffects>,
    statusEffects: List<StatusEffect>
) : Action(
    id, name, description,
    jp,
    Range.Item,
    VerticalRange.Item,
    true,
    0,
    100,
    0,
    statsChange,
    otherEffects,
    statusEffects
)
