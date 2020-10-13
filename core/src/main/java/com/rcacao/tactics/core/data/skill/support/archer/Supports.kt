package com.rcacao.tactics.core.data.skill.support.archer

import com.rcacao.tactics.core.data.skill.support.Support
import com.rcacao.tactics.core.data.skill.support.SupportId

object EquipCrossbow : Support(
    SupportId.EQUIP_CROSSBOW,
    "Equip Crossbows",
    "Equip crossbows, regardless of job.",
    350
)

object Concentrate : Support(
    SupportId.CONCENTRATE,
    "Concentrate",
    "Make attacks unblockable. If an enemy is in the targeted tile, it will always be a hit.",
    400
)