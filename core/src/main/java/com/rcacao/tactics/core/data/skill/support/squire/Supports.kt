package com.rcacao.tactics.core.data.skill.support.squire

import com.rcacao.tactics.core.data.skill.support.Support
import com.rcacao.tactics.core.data.skill.support.SupportId

object EquipAxes : Support(
    id = SupportId.EQUIP_AXES,
    name = "Equip Axes",
    description = "Equip axes, regardless of job.",
    jp = 170
)

object Defend : Support(
    id = SupportId.DEFEND,
    name = "Defend",
    description = "Defend oneself against an attack. Adds the Defend command.",
    jp = 50
)

object JpBoost : Support(
    id = SupportId.JP_BOOST,
    name = "JP Boost",
    description = "Increase the amount of JP earned in battle.",
    jp = 250
)