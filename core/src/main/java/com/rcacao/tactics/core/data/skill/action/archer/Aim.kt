package com.rcacao.tactics.core.data.skill.action.archer

import com.rcacao.tactics.core.data.skill.action.Action
import com.rcacao.tactics.core.data.skill.action.Range
import com.rcacao.tactics.core.data.skill.action.VerticalRange

open class Aim(
    id: AimId,
    jp: Int,
    speed: Int,
    charge: Int
) : Action(
    id = id,
    name = "Aim +$charge",
    description = "Carefully aim to strike for increased damage. Attack power increases with longer charge time.",
    jp = jp,
    range = Range.Weapon,
    verticalRange = VerticalRange.Weapon,
    casterTarget = false,
    speed = speed,
    successRate = 100,
    mp = 0,
    statsChange = emptyList(),
    otherEffects = emptyList(),
    statusEffects = emptyList()
)
