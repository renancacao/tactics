package com.rcacao.tactics.core.data.equipment.weapon.dagger

import com.rcacao.tactics.core.data.elements.Element
import com.rcacao.tactics.core.data.status.Status
import com.rcacao.tactics.core.data.status.StatusEffect
import com.rcacao.tactics.core.data.status.StatusOperation

object SimpleDagger : Dagger(
    id = DaggerId.DAGGER,
    name = "Dagger",
    wp = 3,
    ev = 0,
    price = 100,
    enemyLevel = 1
)

object MyrthrilKnife : Dagger(
    id = DaggerId.MYTHRIL_KNIFE,
    name = "Mythril Knife",
    wp = 4,
    ev = 5,
    price = 500,
    enemyLevel = 3
)

object BlindKnife : Dagger(
    id = DaggerId.BLIND_KNIFE,
    name = "Blind Knife",
    wp = 4,
    ev = 5,
    price = 800,
    enemyLevel = 7,
    statusEffects = listOf(
        StatusEffect(
            Status.DARKNESS,
            StatusOperation.ADD,
            25
        )
    )
)

object MageMasher : Dagger(
    id = DaggerId.MAGE_MASHER,
    name = "Mage Masher",
    wp = 4,
    ev = 5,
    price = 1500,
    enemyLevel = 11,
    statusEffects = listOf(
        StatusEffect(
            Status.SILENCE,
            StatusOperation.ADD,
            25
        )
    )
)

object PlatinaDagger : Dagger(
    id = DaggerId.PLATINA_DAGGER,
    name = "Platina Dagger",
    wp = 5,
    ev = 10,
    price = 1800,
    enemyLevel = 14
)

object MainGauche : Dagger(
    id = DaggerId.MAIN_GAUCHE,
    name = "Main Gauche",
    wp = 6,
    ev = 40,
    price = 3000,
    enemyLevel = 21
)

object Orichalcum : Dagger(
    id = DaggerId.ORICHALCUM,
    name = "Orichalcum",
    wp = 7,
    ev = 5,
    price = 4000,
    enemyLevel = 25
)

object AssassinDagger : Dagger(
    id = DaggerId.ASSASSIN_DAGGER,
    name = "Assassin Dagger",
    wp = 7,
    ev = 5,
    price = 5000,
    enemyLevel = 29,
    statusEffects = listOf(
        StatusEffect(
            Status.DEATH_SENTENCE,
            StatusOperation.ADD,
            25
        )
    )
)

object AirKnife : Dagger(
    id = DaggerId.AIR_KNIFE,
    name = "Air Knife",
    wp = 10,
    ev = 5,
    price = 8000,
    enemyLevel = 33,
    elements = listOf(Element.WIND)
)

object ZorlinShape : Dagger(
    id = DaggerId.ZORLIN_SHAPE,
    name = "Zorlin Shape",
    wp = 12,
    ev = 10,
    price = 12000,
    enemyLevel = 96,
    enemyEquips = false,
    statusEffects = listOf(
        StatusEffect(
            Status.SLEEP,
            StatusOperation.ADD,
            25
        )
    )
)

