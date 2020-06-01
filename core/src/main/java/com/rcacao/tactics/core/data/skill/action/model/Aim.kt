package com.rcacao.tactics.core.data.skill.action.model

import com.rcacao.tactics.core.domain.skill.action.Range
import com.rcacao.tactics.core.domain.skill.action.VerticalRange

class Aim(
    id: Int,
    jp: Int,
    speed: Int,
    charge: Int
) : Action(
    id,
    "Aim +$charge",
    "Carefully aim to strike for increased damage. Attack power increases with longer charge time.",
    jp,
    Range.Weapon,
    VerticalRange.Weapon,
    false,
    speed,
    100,
    0,
    emptyList(),
    emptyList(),
    emptyList()
)
