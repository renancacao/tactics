package com.rcacao.tactics.data.skills.actions

import com.rcacao.tactics.data.skills.*

class Attack(
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
)
