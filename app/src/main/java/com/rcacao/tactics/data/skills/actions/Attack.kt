package com.rcacao.tactics.data.skills.actions

import com.rcacao.tactics.data.skills.*
import com.rcacao.tactics.data.skills.Target

sealed class Attack(
    id: Int,
    name: String,
    description: String,
    jp: Int,
    range: Range,
    verticalRange: VerticalRange,
    casterTarget: Boolean,
    speed: Int,
    successRate: Int,
    mp: Int,
    val type: Type,
    val element: Element,
    val damageCalculation: damageCalculation,
    val damageFormula: DamageFormula,
    val reflect: Boolean,
    val calc: Boolean,
    val counterGrasp: Boolean,
    val counterMagic: Boolean,
    val counterFlood: Boolean,
    val evade: Boolean,
    statsChange: List<StatsChange>,
    otherEffects: List<OtherEffects>,
    statusEffects: List<StatusEffect>
) : Action(
    id,
    name,
    description,
    jp,
    range,
    verticalRange,
    casterTarget,
    speed,
    successRate,
    mp,
    statsChange,
    otherEffects,
    statusEffects
) {

    object Focus : Attack(
        1,
        "Focus",
        "Increase physical attack power.",
        300,
        Range.Self,
        VerticalRange.None,
        true,
        0,
        100,
        0,
        Type.NEUTRAL,
        Element.NONE,
        com.rcacao.tactics.data.skills.damageCalculation.IMMUTABLE,
        DamageFormula.Nothing,
        reflect = false,
        calc = false,
        counterGrasp = false,
        counterMagic = false,
        counterFlood = false,
        evade = false,
        statsChange = listOf(StatsChange(Stats.PHYSICAL_ATTACK, 1, Target.CASTER)),
        otherEffects = emptyList(),
        statusEffects = emptyList()
    )

    object Rush : Attack(
        2,
        "Rush",
        "Attack by ramming into the enemy's body.",
        80,
        Range.Value(1),
        VerticalRange.Value(1),
        false,
        0,
        100,
        0,
        Type.PHYSICAL,
        Element.NONE,
        com.rcacao.tactics.data.skills.damageCalculation.PHYSICAL_DAMAGE_VARIABLE,
        DamageFormula.PAVsRandom(1, 4),
        reflect = false,
        calc = false,
        counterGrasp = false,
        counterMagic = false,
        counterFlood = false,
        evade = false,
        statsChange = emptyList(),
        otherEffects = listOf(OtherEffects.Knockback(0.5f)),
        statusEffects = emptyList()
    )

    object Stone : Attack(
        3,
        "Stone",
        "Lob a stone at a far-off foe.",
        90,
        Range.Value(4),
        VerticalRange.None,
        false,
        0,
        100,
        0,
        Type.PHYSICAL,
        Element.NONE,
        com.rcacao.tactics.data.skills.damageCalculation.PHYSICAL_DAMAGE_VARIABLE,
        DamageFormula.PAVsRandom(1, 2),
        reflect = false,
        calc = false,
        counterGrasp = false,
        counterMagic = false,
        counterFlood = false,
        evade = true,
        statsChange = emptyList(),
        otherEffects = listOf(OtherEffects.Knockback(0.5f)),
        statusEffects = emptyList()
    )

    object Salve : Attack(
        4,
        "Salve",
        "Remove several status ailments.",
        150,
        Range.Value(1),
        VerticalRange.Value(2),
        false,
        0,
        100,
        0,
        Type.NEUTRAL,
        Element.NONE,
        com.rcacao.tactics.data.skills.damageCalculation.IMMUTABLE,
        DamageFormula.Nothing,
        reflect = false,
        calc = false,
        counterGrasp = false,
        counterMagic = false,
        counterFlood = false,
        evade = false,
        statsChange = emptyList(),
        otherEffects = emptyList(),
        statusEffects = listOf(
            StatusEffect(Status.DARKNESS, StatusOperation.REMOVE),
            StatusEffect(Status.SILENCE, StatusOperation.REMOVE),
            StatusEffect(Status.POISON, StatusOperation.REMOVE)
        )
    )

}