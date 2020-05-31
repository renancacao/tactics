package com.rcacao.tactics.core.data.job.datasource

import com.rcacao.tactics.core.data.job.Job

interface JobDataSource {
    suspend fun getJobs(): List<Job>
    suspend fun getInitialJob(): Job
}