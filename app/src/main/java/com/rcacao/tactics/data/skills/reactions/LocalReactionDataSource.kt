package com.rcacao.tactics.data.skills.reactions

import com.rcacao.tactics.data.jobs.JobId

class LocalReactionDataSource() {

    fun reactions(jobId: JobId): List<Reaction> {
        return when (jobId) {
            JobId.SQUIRE -> listOf(Reaction.CounterTackle)
            JobId.CHEMIST -> listOf(Reaction.AutoPotion)
            JobId.ARCHER -> listOf(Reaction.AdrenalineRush, Reaction.ArcherBane)
        }
    }

}