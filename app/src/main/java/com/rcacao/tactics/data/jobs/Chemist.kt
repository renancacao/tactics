package com.rcacao.tactics.data.jobs

import com.rcacao.tactics.data.skills.actions.ActionDataSource
import com.rcacao.tactics.data.skills.movement.MovementDataSource
import com.rcacao.tactics.data.skills.reactions.ReactionDataSource
import com.rcacao.tactics.data.skills.support.SupportDataSource

object Chemist : Job(
    2,
    "Chemist",
    "An expert in the use of items to recover HP or remove vexing status ailments.",
    3,
    3,
    8,
    0.05f,
    baseAttack = StatsMeasure.LOW,
    baseMagick = StatsMeasure.AVERAGE,
    baseHP = StatsMeasure.LOW,
    baseMP = StatsMeasure.AVERAGE
) {
    override fun loadSkills(): JobSkill {
        return JobSkill(
            "Items",
            "Chemist job command. Enables the use of items to assist allies in need.",
            ActionDataSource.actions(this),
            ReactionDataSource.reactions(this),
            SupportDataSource.supports(this),
            MovementDataSource.moves(this)
        )
    }

}