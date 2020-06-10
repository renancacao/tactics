package com.rcacao.tactics.teambuild.data.job

import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.core.data.job.model.Job
import com.rcacao.tactics.teambuild.data.job.datasource.JobDataSource

class JobRepositoryImpl(private val jobDataSource: JobDataSource) : JobRepository {
    override suspend fun getInitialJob(): Result<Job> = jobDataSource.getInitialJob()
}
