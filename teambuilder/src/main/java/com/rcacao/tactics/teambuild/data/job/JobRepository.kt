package com.rcacao.tactics.teambuild.data.job

import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.core.data.job.model.Job

interface JobRepository {
    suspend fun getJob(): Result<Job>
}