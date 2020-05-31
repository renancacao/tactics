package com.rcacao.tactics.core.data.job

import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.core.data.job.datasource.JobDataSource

class JobRepositoryImpl(private val jobDataSource: JobDataSource) : JobRepository {
    override suspend fun getJob(): Result<Job> = Result.Success(jobDataSource.getInitialJob())
}
