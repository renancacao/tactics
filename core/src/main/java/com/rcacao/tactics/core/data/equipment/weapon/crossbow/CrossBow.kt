package com.rcacao.tactics.core.data.equipment.weapon.crossbow

import com.rcacao.tactics.core.data.equipment.weapon.Weapon
import com.rcacao.tactics.core.data.equipment.weapon.range.FireRange
import com.rcacao.tactics.core.data.status.StatusEffect
import java.util.Collections.emptyList

open class CrossBow(
    id: CrossBowId,
    name: String,
    wp: Int,
    ev: Int,
    price: Int,
    enemyLevel: Int,
    enemyEquips: Boolean = true,
    statusEffects: List<StatusEffect> = emptyList()
) : Weapon(
    id = id,
    name = name,
    wp = wp,
    ev = ev,
    price = price,
    eLevel = enemyLevel,
    enemyEquips = enemyEquips,
    damageFormula = "PA * WP",
    weaponRange = FireRange(
        3,
        4
    ),
    twoSwords = false,
    twoHands = false,
    statusEffects = statusEffects
)