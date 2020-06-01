package com.rcacao.tactics.teambuild.data.soldier

import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.core.data.job.model.Job
import com.rcacao.tactics.core.data.soldier.model.Soldier

interface SoldierRepository {
    suspend fun getRandomSoldier(job: Job): Result<Soldier>
}

