package com.rcacao.tactics.teambuild.data.job

import com.rcacao.tactics.core.data.job.datasource.JobDataSource
import com.rcacao.tactics.core.data.job.jobs.Job
import com.rcacao.tactics.core.domain.Result
import javax.inject.Inject

class JobRepositoryImpl @Inject constructor(private val jobDataSource: JobDataSource) :
    JobRepository {
    override suspend fun getInitialJob(): Result<Job> = jobDataSource.getInitialJob()
}
