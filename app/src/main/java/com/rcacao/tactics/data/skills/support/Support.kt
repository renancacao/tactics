package com.rcacao.tactics.data.skills.support

import com.rcacao.tactics.data.skills.Skill

sealed class Support(
    override val id: Int,
    override val name: String,
    override val description: String,
    override val jp: Int
) : Skill {

    object EquipAxes : Support(1, "Equip Axes", "Equip axes, regardless of job.", 170)

    object Defend :
        Support(2, "Defend", "Defend oneself against an attack. Adds the Defend command.", 50)

    object JPBoost : Support(3, "JP Boost", "Increase the amount of JP earned in battle.", 250)

    object ThrowItem : Support(
        4,
        "Throw Item",
        "Throw items within an increased radius, even if not a Chemist.",
        350
    )

    object Safeguard :
        Support(5, "Safeguard", "Prevent equipment from being destroyed or stolen.", 250)

    object Reequip :
        Support(6, "Reequip", "Change equipment mid-battle. Adds the Reequip command.", 0)

    object EquipCrossbows :
        Support(7, "Equip Crossbows", "Equip crossbows, regardless of job.", 350)

    object Concentrate :
        Support(
            8,
            "Concentrate",
            "Make attacks unblockable. If an enemy is in the targeted tile, it will always be a hit.",
            400
        )

}