package com.rcacao.tactics.data.skills.actions

import com.rcacao.tactics.data.skills.OtherEffects
import com.rcacao.tactics.data.skills.Range
import com.rcacao.tactics.data.skills.StatsChange
import com.rcacao.tactics.data.skills.StatusEffect

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
    id,
    name,
    description,
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
