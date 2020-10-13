package com.rcacao.tactics.core.data.skill.action.chemist

import com.rcacao.tactics.core.data.skill.SkillTarget
import com.rcacao.tactics.core.data.stats.Stats
import com.rcacao.tactics.core.data.stats.StatsChange
import com.rcacao.tactics.core.data.stats.StatsChangeValue
import com.rcacao.tactics.core.data.status.Status
import com.rcacao.tactics.core.data.status.StatusEffect
import com.rcacao.tactics.core.data.status.StatusOperation

object Potion : Item(
    id = ItemId.POTION,
    name = "Potion",
    description = "Use a potion to restore HP or inflict damage on the undead.",
    jp = 30,
    statsChange = listOf(
        StatsChange(
            stats = Stats.HP,
            value = 30,
            skillTarget = SkillTarget.TARGET
        )
    )
)

object HiPotion : Item(
    id = ItemId.HI_POTION,
    name = "Hi-Potion",
    description = "Use a Hi-Potion to restore HP. A more potent draught than a Potion.",
    jp = 200,
    statsChange = listOf(
        StatsChange(
            stats = Stats.HP,
            value = 70,
            skillTarget = SkillTarget.TARGET
        )
    )
)

object XPotion : Item(
    id = ItemId.X_POTION,
    name = "X-Potion",
    description = "Use an X-Potion to restore HP. A more potent draught than a Hi-Potion.",
    jp = 300,
    statsChange = listOf(
        StatsChange(
            stats = Stats.HP,
            value = 150,
            skillTarget = SkillTarget.TARGET
        )
    )
)

object PhoenixDown : Item(
    id = ItemId.PHOENIX_DOWN,
    name = "Phoenix Down",
    description = "Use phoenix down to restore life to a fallen unit. Vanishes after one use.",
    jp = 90,
    statsChange = listOf(
        StatsChange(
            stats = Stats.HP,
            value = StatsChangeValue.Random(1, 20),
            skillTarget = SkillTarget.TARGET
        )
    ),
    statusEffects = listOf(
        StatusEffect(
            status = Status.DEAD,
            operation = StatusOperation.REMOVE
        )
    )
)