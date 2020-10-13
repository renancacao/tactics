package com.rcacao.tactics.core.data.equipment.weapon.crossbow

import com.rcacao.tactics.core.data.status.Status
import com.rcacao.tactics.core.data.status.StatusEffect
import com.rcacao.tactics.core.data.status.StatusOperation

object BowGun : CrossBow(
    id = CrossBowId.BOW_GUN,
    name = "Bow Gun",
    wp = 3,
    ev = 5,
    price = 400,
    enemyLevel = 1
)

object NightKiller : CrossBow(
    id = CrossBowId.NIGHT_KILLER,
    name = "Night Killer",
    wp = 3,
    ev = 5,
    price = 1500,
    enemyLevel = 5,
    statusEffects = listOf(
        StatusEffect(
            Status.DARKNESS,
            StatusOperation.ADD,
            25
        )
    )
)