package com.rcacao.tactics.core.data.equipment

import com.rcacao.tactics.core.domain.equipment.WeaponId
import com.rcacao.tactics.core.domain.equipment.WeaponRange
import com.rcacao.tactics.core.domain.status.StatusEffect

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
    val statusEffects: List<StatusEffect> = emptyList()
)