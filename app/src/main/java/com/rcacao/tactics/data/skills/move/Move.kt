package com.rcacao.tactics.data.skills.move

import com.rcacao.tactics.data.skills.Skill
import com.rcacao.tactics.data.skills.SkillTarget
import com.rcacao.tactics.data.skills.Stats
import com.rcacao.tactics.data.skills.StatsChange

sealed class Move(
    override val id: Int,
    override val name: String,
    override val description: String,
    override val jp: Int,
    val statsChange: List<StatsChange> = emptyList()
) : Skill {

    object Move1 : Move(
        1,
        "Move +1",
        "Increase Move by 1.",
        200,
        listOf(StatsChange(Stats.MOVE, 1, SkillTarget.CASTER))
    )

    object Jump1 : Move(
        2,
        "Jump +1",
        "Increase Jump by 1.",
        200,
        listOf(StatsChange(Stats.JUMP, 1, SkillTarget.CASTER))
    )

    object TreasureHunter : Move(
        3,
        "Treasure Hunter",
        "Discover items hidden on tiles upon moving to them.",
        100
    )

}