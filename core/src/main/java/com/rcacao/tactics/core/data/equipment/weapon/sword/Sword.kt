package com.rcacao.tactics.core.data.equipment.weapon.sword

import com.rcacao.tactics.core.data.equipment.weapon.Weapon
import com.rcacao.tactics.core.data.equipment.weapon.range.ContactRange
import com.rcacao.tactics.core.data.status.StatusEffect
import java.util.Collections.emptyList

open class Sword(
    id: SwordId,
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
    weaponRange = ContactRange(
        1,
        2,
        1,
        3
    ),
    twoSwords = true,
    twoHands = true,
    statusEffects = statusEffects
)