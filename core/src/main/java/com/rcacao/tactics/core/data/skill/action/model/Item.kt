package com.rcacao.tactics.core.data.skill.action.model

import com.rcacao.tactics.core.data.stats.model.StatsChange
import com.rcacao.tactics.core.domain.skill.action.ItemId
import com.rcacao.tactics.core.domain.skill.action.OtherEffects
import com.rcacao.tactics.core.domain.skill.action.Range
import com.rcacao.tactics.core.domain.skill.action.VerticalRange
import com.rcacao.tactics.core.domain.status.StatusEffect

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
