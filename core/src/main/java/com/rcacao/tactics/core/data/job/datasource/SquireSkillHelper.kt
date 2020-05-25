package com.rcacao.tactics.core.data.job.datasource

import com.rcacao.tactics.core.data.damage.DamageCalculation
import com.rcacao.tactics.core.data.damage.DamageFormula
import com.rcacao.tactics.core.data.job.JobSkill
import com.rcacao.tactics.core.data.skill.SkillTarget
import com.rcacao.tactics.core.data.skill.action.*
import com.rcacao.tactics.core.data.skill.movement.Movement
import com.rcacao.tactics.core.data.skill.reaction.Reaction
import com.rcacao.tactics.core.data.skill.reaction.ReactionTrigger
import com.rcacao.tactics.core.data.skill.support.Support
import com.rcacao.tactics.core.data.stats.Stats
import com.rcacao.tactics.core.data.stats.StatsChange
import com.rcacao.tactics.core.data.status.Status
import com.rcacao.tactics.core.data.status.StatusEffect
import com.rcacao.tactics.core.data.status.StatusOperation

class SquireSkillHelper : JobSkillHelper {

    override fun getSkills() = JobSkill(
        "Fundaments",
        "Squire job command. These are the most fundamental of all battle techniques.",
        getActions(),
        getReactions(),
        getSupports(),
        getMovements()
    )

    private fun getActions(): List<Attack> = listOf(
        Attack(
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
            DamageCalculation.IMMUTABLE,
            DamageFormula.Nothing,
            reflect = false,
            calc = false,
            counterGrasp = false,
            counterMagic = false,
            counterFlood = false,
            evade = false,
            statsChange = listOf(StatsChange(Stats.PHYSICAL_ATTACK, 1, SkillTarget.CASTER)),
            otherEffects = emptyList(),
            statusEffects = emptyList()
        ),
        Attack(
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
            DamageCalculation.PHYSICAL_DAMAGE_VARIABLE,
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
        ),
        Attack(
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
            DamageCalculation.PHYSICAL_DAMAGE_VARIABLE,
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
        ),
        Attack(
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
            DamageCalculation.IMMUTABLE,
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
    )

    private fun getReactions(): List<Reaction> = listOf(
        Reaction(
            1,
            "Counter Tackle",
            "Counter attack with a tackle. (Rush)",
            180,
            ReactionTrigger.PHYSICAL_ATTACK
        )
    )

    private fun getSupports(): List<Support> = listOf(
        Support(1, "Equip Axes", "Equip axes, regardless of job.", 170),
        Support(2, "Defend", "Defend oneself against an attack. Adds the Defend command.", 50),
        Support(3, "JP Boost", "Increase the amount of JP earned in battle.", 250)
    )

    private fun getMovements(): List<Movement> = listOf(
        Movement(
            1,
            "Move +1",
            "Increase Move by 1.",
            200,
            listOf(StatsChange(Stats.MOVE, 1, SkillTarget.CASTER))
        )
    )

}