package com.rcacao.tactics.data.skills.actions

import com.rcacao.tactics.data.skills.*

sealed class Item(
    id: Int,
    name: String,
    description: String,
    jp: Int,
    val itemId: ItemId,
    statsChange: List<StatsChange>,
    otherEffects: List<OtherEffects>,
    statusEffects: List<StatusEffect>
) : Action(
    id, name, description,
    jp,
    Range.Item,
    VerticalRange.Item,
    true,
    0,
    100,
    0,
    statsChange,
    otherEffects,
    statusEffects
) {

    object Potion : Item(
        5,
        "Potion",
        "Use a potion to restore HP or inflict damage on the undead.",
        30,
        ItemId.POTION,
        statsChange = listOf(StatsChange(Stats.HP, 30, SkillTarget.TARGET)),
        otherEffects = emptyList(),
        statusEffects = emptyList()
    )

    object HiPotion : Item(
        6,
        "Hi-Potion",
        "Use a Hi-Potion to restore HP. A more potent draught than a Potion.",
        200,
        ItemId.HI_POTION,
        statsChange = listOf(StatsChange(Stats.HP, 70, SkillTarget.TARGET)),
        otherEffects = emptyList(),
        statusEffects = emptyList()
    )

    object XPotion : Item(
        7,
        "X-Potion",
        "Use an X-Potion to restore HP. A more potent draught than a Hi-Potion.",
        300,
        ItemId.X_POTION,
        statsChange = listOf(StatsChange(Stats.HP, 150, SkillTarget.TARGET)),
        otherEffects = emptyList(),
        statusEffects = emptyList()
    )

    object PhoenixDown : Item(
        8,
        "Phoenix Down",
        "Use phoenix down to restore life to a fallen unit. Vanishes after one use.",
        90,
        ItemId.PHOENIX_DOWN,
        statsChange = listOf(
            StatsChange(
                Stats.HP,
                StatsChangeValue.Random(1, 20),
                SkillTarget.TARGET
            )
        ),
        otherEffects = emptyList(),
        statusEffects = listOf(StatusEffect(Status.DEAD, StatusOperation.REMOVE))
    )

}
