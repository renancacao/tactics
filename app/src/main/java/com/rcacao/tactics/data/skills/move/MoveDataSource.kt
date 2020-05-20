package com.rcacao.tactics.data.skills.move

import com.rcacao.tactics.data.jobs.JobId

class MoveDataSource() {

    fun moves(jobId: JobId): List<Move> {
        return when (jobId) {
            JobId.SQUIRE -> listOf(Move.Move1)
            JobId.CHEMIST -> listOf(Move.TreasureHunter)
            JobId.ARCHER -> listOf(Move.Jump1)
        }
    }

}