package com.rcacao.tactics.teambuild.data.soldier

import com.rcacao.tactics.core.data.job.jobs.Job
import com.rcacao.tactics.core.data.soldier.Soldier
import com.rcacao.tactics.core.domain.Result

interface SoldierRepository {
    suspend fun getRandomSoldier(job: Job): Result<Soldier>
    suspend fun getSavedSoldiers(): Result<List<Soldier>>
    suspend fun saveSoldier(soldier: Soldier): Result<Long>
}

