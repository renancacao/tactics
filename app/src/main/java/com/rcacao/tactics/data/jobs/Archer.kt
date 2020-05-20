package com.rcacao.tactics.data.jobs

import com.rcacao.tactics.data.skills.actions.ActionDataSource
import com.rcacao.tactics.data.skills.movement.MovementDataSource
import com.rcacao.tactics.data.skills.reactions.ReactionDataSource
import com.rcacao.tactics.data.skills.support.SupportDataSource

object Archer : Job(
    3,
    "Archer",
    "Equipped with a bow and arrow, this warrior provides valuable long-range attacks. May Aim for higher damage.",
    3,
    3,
    8,
    0.1f,
    baseAttack = StatsMeasure.AVERAGE,
    baseMagick = StatsMeasure.LOW,
    baseHP = StatsMeasure.AVERAGE,
    baseMP = StatsMeasure.LOW
) {
    override fun loadSkills(): JobSkill {
        return JobSkill(
            "Aim",
            "Archer job command. Allows attacks to be carefully aimed in order to deal greater damage.",
            ActionDataSource.actions(this),
            ReactionDataSource.reactions(this),
            SupportDataSource.supports(this),
            MovementDataSource.moves(this)
        )
    }

}