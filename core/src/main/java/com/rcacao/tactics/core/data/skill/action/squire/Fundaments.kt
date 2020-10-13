package com.rcacao.tactics.core.data.skill.action.squire

import com.rcacao.tactics.core.data.damage.DamageCalculation
import com.rcacao.tactics.core.data.damage.DamageFormula
import com.rcacao.tactics.core.data.skill.SkillTarget
import com.rcacao.tactics.core.data.skill.action.Range
import com.rcacao.tactics.core.data.skill.action.Type
import com.rcacao.tactics.core.data.skill.action.VerticalRange
import com.rcacao.tactics.core.data.skill.effects.OtherEffects
import com.rcacao.tactics.core.data.stats.Stats
import com.rcacao.tactics.core.data.stats.StatsChange
import com.rcacao.tactics.core.data.status.Status
import com.rcacao.tactics.core.data.status.StatusEffect
import com.rcacao.tactics.core.data.status.StatusOperation

object Focus : Fundament(
    id = FundamentId.FOCUS,
    name = "Focus",
    description = "Increase physical attack power.",
    jp = 300,
    range = Range.Self,
    verticalRange = VerticalRange.None,
    casterTarget = true,
    type = Type.NEUTRAL,
    damageCalculation = DamageCalculation.IMMUTABLE,
    damageFormula = DamageFormula.Nothing,
    evade = false,
    statsChange = listOf(
        StatsChange(
            stats = Stats.PHYSICAL_ATTACK,
            value = 1,
            skillTarget = SkillTarget.CASTER
        )
    )
)

object Rush : Fundament(
    id = FundamentId.RUSH,
    name = "Rush",
    description = "Attack by ramming into the enemy's body.",
    jp = 80,
    range = Range.Value(1),
    verticalRange = VerticalRange.Value(1),
    casterTarget = false,
    type = Type.PHYSICAL,
    damageCalculation = DamageCalculation.PHYSICAL_DAMAGE_VARIABLE,
    damageFormula = DamageFormula.PAVsRandom(1, 4),
    evade = false,
    otherEffects = listOf(OtherEffects.Knockback(successRate = 0.5f))
)

object Stone : Fundament(
    id = FundamentId.STONE,
    name = "Stone",
    description = "Lob a stone at a far-off foe.",
    jp = 90,
    range = Range.Value(4),
    verticalRange = VerticalRange.None,
    casterTarget = false,
    type = Type.PHYSICAL,
    damageCalculation = DamageCalculation.PHYSICAL_DAMAGE_VARIABLE,
    damageFormula = DamageFormula.PAVsRandom(1, 2),
    evade = true,
    otherEffects = listOf(OtherEffects.Knockback(successRate = 0.5f))
)

object Salve : Fundament(
    id = FundamentId.SALVE,
    name = "Salve",
    description = "Remove several status ailments.",
    jp = 150,
    range = Range.Value(1),
    verticalRange = VerticalRange.Value(2),
    casterTarget = false,
    type = Type.NEUTRAL,
    damageCalculation = DamageCalculation.IMMUTABLE,
    damageFormula = DamageFormula.Nothing,
    evade = false,
    statusEffects = listOf(
        StatusEffect(
            status = Status.DARKNESS,
            operation = StatusOperation.REMOVE
        ),
        StatusEffect(
            status = Status.SILENCE,
            operation = StatusOperation.REMOVE
        ),
        StatusEffect(
            status = Status.POISON,
            operation = StatusOperation.REMOVE
        )
    )
)