package com.rcacao.tactics.data.skills.actions

import com.rcacao.tactics.data.jobs.JobId
import com.rcacao.tactics.data.skills.*
import com.rcacao.tactics.data.skills.Target

class LocalActionDataSource() {

    private val focus = Attack(
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
        damageCalculation.IMMUTABLE,
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

    private val rush = Attack(
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
        damageCalculation.PHYSICAL_DAMAGE_VARIABLE,
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

    private val stone = Attack(
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
        damageCalculation.PHYSICAL_DAMAGE_VARIABLE,
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

    private val salve = Attack(
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
        damageCalculation.IMMUTABLE,
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

    private val potion = Item(
        5,
        "Potion",
        "Use a potion to restore HP or inflict damage on the undead.",
        30,
        ItemId.POTION,
        statsChange = listOf(StatsChange(Stats.HP, 30, Target.TARGET)),
        otherEffects = emptyList(),
        statusEffects = emptyList()
    )

    private val hiPotion = Item(
        6,
        "Hi-Potion",
        "Use a Hi-Potion to restore HP. A more potent draught than a Potion.",
        200,
        ItemId.HI_POTION,
        statsChange = listOf(StatsChange(Stats.HP, 70, Target.TARGET)),
        otherEffects = emptyList(),
        statusEffects = emptyList()
    )

    private val xPotion = Item(
        7,
        "X-Potion",
        "Use an X-Potion to restore HP. A more potent draught than a Hi-Potion.",
        300,
        ItemId.X_POTION,
        statsChange = listOf(StatsChange(Stats.HP, 150, Target.TARGET)),
        otherEffects = emptyList(),
        statusEffects = emptyList()
    )

    private val phoenixDown = Item(
        8,
        "Phoenix Down",
        "Use phoenix down to restore life to a fallen unit. Vanishes after one use.",
        90,
        ItemId.PHOENIX_DOWN,
        statsChange = listOf(StatsChange(Stats.HP, StatsChangeValue.Random(1, 20), Target.TARGET)),
        otherEffects = emptyList(),
        statusEffects = listOf(StatusEffect(Status.DEAD, StatusOperation.REMOVE))
    )

    private val aim1 = Aim(9, 100, 4, 1)
    private val aim2 = Aim(9, 150, 5, 2)
    private val aim3 = Aim(9, 200, 6, 3)
    private val aim4 = Aim(9, 250, 8, 4)
    private val aim5 = Aim(9, 300, 10, 5)
    private val aim7 = Aim(9, 400, 14, 7)
    private val aim10 = Aim(9, 700, 20, 10)
    private val aim20 = Aim(9, 1200, 35, 20)


    fun actions(jobId: JobId): List<Action> {
        return when (jobId) {
            JobId.SQUIRE -> listOf(focus, rush, stone, salve)
            JobId.CHEMIST -> listOf(potion, hiPotion, xPotion, phoenixDown)
            JobId.ARCHER -> listOf(aim1, aim2, aim3, aim4, aim5, aim7, aim10, aim20)
        }
    }

}