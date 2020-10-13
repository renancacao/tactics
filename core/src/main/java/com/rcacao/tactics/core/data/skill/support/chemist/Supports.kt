package com.rcacao.tactics.core.data.skill.support.chemist

import com.rcacao.tactics.core.data.skill.support.Support
import com.rcacao.tactics.core.data.skill.support.SupportId

object ThrowItem : Support(
    SupportId.THROW_ITEM,
    "Throw Item",
    "Throw items within an increased radius, even if not a Chemist.",
    350
)

object SafeGuard : Support(
    SupportId.SAFE_GUARD,
    "Safeguard",
    "Prevent equipment from being destroyed or stolen.",
    250
)

object Reequip : Support(
    SupportId.REEQUIP,
    "Reequip",
    "Change equipment mid-battle. Adds the Reequip command.",
    0
)