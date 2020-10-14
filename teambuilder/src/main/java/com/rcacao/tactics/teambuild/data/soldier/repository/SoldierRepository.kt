package com.rcacao.tactics.teambuild.data.soldier.repository

import com.rcacao.tactics.core.data.job.jobs.Job
import com.rcacao.tactics.core.data.soldier.Soldier
import com.rcacao.tactics.core.domain.Result

interface SoldierRepository {
    suspend fun randomSoldier(job: Job): Result<Soldier>
    suspend fun soldiersList(): Result<List<Soldier>>
    suspend fun saveSoldier(soldier: Soldier): Result<Long>
}

