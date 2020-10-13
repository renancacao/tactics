package com.rcacao.tactics.teambuild.data.job

import com.rcacao.tactics.core.data.job.jobs.Job
import com.rcacao.tactics.core.domain.Result

interface JobRepository {
    suspend fun getInitialJob(): Result<Job>
}