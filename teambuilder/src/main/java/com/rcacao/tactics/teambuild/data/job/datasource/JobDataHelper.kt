package com.rcacao.tactics.teambuild.data.job.datasource

import com.rcacao.tactics.core.data.job.model.BaseStats
import com.rcacao.tactics.core.data.job.model.CStats
import com.rcacao.tactics.core.data.job.model.Job
import com.rcacao.tactics.core.data.job.model.JobSkill
import com.rcacao.tactics.core.data.skill.action.model.Action
import com.rcacao.tactics.core.data.skill.movement.model.Movement
import com.rcacao.tactics.core.data.skill.reaction.model.Reaction
import com.rcacao.tactics.core.data.skill.support.model.Support
import com.rcacao.tactics.core.domain.job.JobId

abstract class JobDataHelper(
    val id: JobId,
    val name: String,
    val description: String,
    private val move: Int,
    private val jump: Int,
    private val pev: Int,
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

    private fun getSkills(skillName: String, skillDescription: String) =
        JobSkill(
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
