package com.rcacao.tactics.teambuild.data.soldier.datasource

import com.rcacao.tactics.core.data.job.jobs.Job
import com.rcacao.tactics.core.data.soldier.Soldier
import com.rcacao.tactics.core.domain.Result

interface RandomSoldierDataSource {
    suspend fun randomSoldier(job: Job): Result<Soldier>
}