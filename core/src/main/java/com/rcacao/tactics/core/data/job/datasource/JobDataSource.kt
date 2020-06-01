package com.rcacao.tactics.core.data.job.datasource

import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.core.data.job.Job

interface JobDataSource {
    suspend fun getJobs(): Result<List<Job>>
    suspend fun getInitialJob(): Result<Job>
}