package com.rcacao.tactics.data.skills.movement

import com.rcacao.tactics.data.jobs.Archer
import com.rcacao.tactics.data.jobs.Chemist
import com.rcacao.tactics.data.jobs.Job
import com.rcacao.tactics.data.jobs.Squire

class MovementDataSource {

    companion object {
        fun moves(job: Job): List<Movement> {
            return when (job) {
                is Squire -> listOf(Movement.Move1)
                is Chemist -> listOf(Movement.TreasureHunter)
                is Archer -> listOf(Movement.Jump1)
                else -> emptyList()
            }
        }
    }

}