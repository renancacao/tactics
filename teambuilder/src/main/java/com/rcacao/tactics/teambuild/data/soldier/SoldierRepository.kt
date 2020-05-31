package com.rcacao.tactics.teambuild.data.soldier

import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.core.data.job.Job
import com.rcacao.tactics.core.data.soldier.Soldier

interface SoldierRepository {
    suspend fun getRandomSoldier(job: Job): Result<Soldier>
}

