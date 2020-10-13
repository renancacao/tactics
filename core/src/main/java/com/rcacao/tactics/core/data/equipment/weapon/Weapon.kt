package com.rcacao.tactics.core.data.equipment.weapon

import com.rcacao.tactics.core.data.elements.Element
import com.rcacao.tactics.core.data.equipment.weapon.range.WeaponRange
import com.rcacao.tactics.core.data.status.StatusEffect

open class Weapon(
    val id: WeaponId,
    val name: String,
    val wp: Int,
    val ev: Int,
    val price: Int,
    val eLevel: Int,
    val enemyEquips: Boolean,
    val damageFormula: String,
    val weaponRange: WeaponRange,
    val twoSwords: Boolean,
    val twoHands: Boolean,
    val statusEffects: List<StatusEffect> = emptyList(),
    val elements: List<Element> = emptyList(),
    val magic: List<String> = emptyList()
)