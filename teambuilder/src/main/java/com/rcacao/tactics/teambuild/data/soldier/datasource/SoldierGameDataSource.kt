package com.rcacao.tactics.teambuild.data.soldier.datasource

import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.core.data.job.model.Job
import com.rcacao.tactics.core.data.soldier.model.Soldier

interface SoldierGameDataSource {
    suspend fun randomSoldier(job: Job): Result<Soldier>
}