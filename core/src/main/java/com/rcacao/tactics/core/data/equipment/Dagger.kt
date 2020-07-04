package com.rcacao.tactics.core.data.equipment

import com.rcacao.tactics.core.domain.equipment.WeaponId
import com.rcacao.tactics.core.domain.equipment.WeaponRange
import com.rcacao.tactics.core.domain.status.StatusEffect

class Dagger(
    id: WeaponId,
    name: String,
    wp: Int,
    ev: Int,
    price: Int,
    eLevel: Int,
    enemyEquips: Boolean,
    statusEffects: List<StatusEffect>
) : Weapon(
    id,
    name,
    wp,
    ev,
    price,
    eLevel,
    enemyEquips,
    "[(PA + Sp) / 2] * WP",
    WeaponRange(1, 2, 1, 3),
    true,
    false,
    statusEffects
) {

    constructor(
        id: WeaponId,
        name: String,
        wp: Int,
        ev: Int,
        price: Int,
        eLevel: Int
    ) : this(id, name, wp, ev, price, eLevel, true, emptyList())

    constructor(
        id: WeaponId,
        name: String,
        wp: Int,
        ev: Int,
        price: Int,
        eLevel: Int,
        statusEffects: List<StatusEffect>
    ) : this(id, name, wp, ev, price, eLevel, true, statusEffects)

}