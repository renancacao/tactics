package com.rcacao.tactics.data.skills.reactions

import com.rcacao.tactics.data.jobs.Archer
import com.rcacao.tactics.data.jobs.Chemist
import com.rcacao.tactics.data.jobs.Job
import com.rcacao.tactics.data.jobs.Squire

class ReactionDataSource {

    companion object {
        fun reactions(job: Job): List<Reaction> {
            return when (job) {
                is Squire -> listOf(Reaction.CounterTackle)
                is Chemist -> listOf(Reaction.AutoPotion)
                is Archer -> listOf(Reaction.AdrenalineRush, Reaction.ArcherBane)
                else -> emptyList()
            }
        }
    }

}