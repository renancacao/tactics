package com.rcacao.tactics.core.data.job.datasource

import com.rcacao.tactics.core.data.job.*
import com.rcacao.tactics.core.data.skill.action.Action
import com.rcacao.tactics.core.data.skill.movement.Movement
import com.rcacao.tactics.core.data.skill.reaction.Reaction
import com.rcacao.tactics.core.data.skill.support.Support

abstract class JobDataHelper(
    val id: JobId,
    val name: String,
    val description: String,
    private val move: Int,
    private val jump: Int,
    private val pev: Float,
    private val skillName: String,
    private val skillDescription: String
) {

    fun job(): Job {
        return Job(
            id,
            name,
            description,
            move,
            jump,
            pev,
            getBaseStats(),
            getCStats(),
            getSkills(
                skillName, skillDescription
            )
        )
    }

    abstract fun getCStats(): CStats

    abstract fun getBaseStats(): BaseStats

    private fun getSkills(skillName: String, skillDescription: String) = JobSkill(
        skillName,
        skillDescription,
        getActions(),
        getReactions(),
        getSupports(),
        getMovements()
    )

    abstract fun getMovements(): List<Movement>

    abstract fun getSupports(): List<Support>

    abstract fun getReactions(): List<Reaction>

    abstract fun getActions(): List<Action>

}
