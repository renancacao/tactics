package com.rcacao.tactics.core.data.skill.movement.squire

import com.rcacao.tactics.core.data.skill.SkillTarget
import com.rcacao.tactics.core.data.skill.movement.Movement
import com.rcacao.tactics.core.data.skill.movement.MovementId
import com.rcacao.tactics.core.data.stats.Stats
import com.rcacao.tactics.core.data.stats.StatsChange

object Move1 : Movement(
    id = MovementId.MOVE1,
    name = "Move +1",
    description = "Increase Move by 1.",
    jp = 200,
    statsChange = listOf(
        StatsChange(
            stats = Stats.MOVE,
            value = 1,
            skillTarget = SkillTarget.CASTER
        )
    )
)