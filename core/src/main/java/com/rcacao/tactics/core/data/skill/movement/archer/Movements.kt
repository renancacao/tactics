package com.rcacao.tactics.core.data.skill.movement.archer

import com.rcacao.tactics.core.data.skill.SkillTarget
import com.rcacao.tactics.core.data.skill.movement.Movement
import com.rcacao.tactics.core.data.skill.movement.MovementId
import com.rcacao.tactics.core.data.stats.Stats
import com.rcacao.tactics.core.data.stats.StatsChange

object Jump1 : Movement(
    id = MovementId.JUMP1,
    name = "Jump +1",
    description = "Increase Jump by 1.",
    jp = 200,
    statsChange = listOf(
        StatsChange(
            stats = Stats.JUMP,
            value = 1,
            skillTarget = SkillTarget.CASTER
        )
    )
)
