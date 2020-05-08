package com.rcacao.tactics.data.skills.actions

import com.rcacao.tactics.data.skills.Range

sealed class Aim(
    id: Int,
    jp: Int,
    speed: Int,
    private val charge: Int
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
) {

    object Aim1 : Aim(9, 100, 4, 1)
    object Aim2 : Aim(9, 150, 5, 2)
    object Aim3 : Aim(9, 200, 6, 3)
    object Aim4 : Aim(9, 250, 8, 4)
    object Aim5 : Aim(9, 300, 10, 5)
    object Aim7 : Aim(9, 400, 14, 7)
    object Aim10 : Aim(9, 700, 20, 10)
    object Aim20 : Aim(9, 1200, 35, 20)

}
