package com.rcacao.tactics.data.jobs

import com.rcacao.tactics.data.skills.actions.ActionDataSource
import com.rcacao.tactics.data.skills.movement.MovementDataSource
import com.rcacao.tactics.data.skills.reactions.ReactionDataSource
import com.rcacao.tactics.data.skills.support.SupportDataSource

object Squire : Job(
    1,
    "Squire",
    "This job serves as the foundation for all others, forming the first step on the road to becoming a legendary warrior.",
    4,
    3,
    6,
    0.05f,
    baseAttack = StatsMeasure.LOW,
    baseMagick = StatsMeasure.VERY_LOW,
    baseHP = StatsMeasure.MEDIUM,
    baseMP = StatsMeasure.VERY_LOW
) {
    override fun loadSkills(): JobSkill {
        return JobSkill(
            "Fundaments",
            "Squire job command. These are the most fundamental of all battle techniques.",
            ActionDataSource.actions(this),
            ReactionDataSource.reactions(this),
            SupportDataSource.supports(this),
            MovementDataSource.moves(this)
        )
    }

}