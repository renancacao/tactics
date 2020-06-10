package com.rcacao.tactics.teambuild.data.job.datasource

import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.core.data.job.model.Job
import com.rcacao.tactics.core.domain.job.JobId

class JobGameDataSource(
    private val squireJobDataHelper: JobDataHelper,
    private val chemistJobDataHelper: JobDataHelper,
    private val archerJobDataHelper: JobDataHelper
) : JobDataSource {

    override suspend fun getJobs(): Result<List<Job>> = try {
        Result.Success(
            listOf(
                squireJobDataHelper.job(),
                chemistJobDataHelper.job(),
                archerJobDataHelper.job()
            )
        )
    } catch (ex: Exception) {
        Result.Error(ex)
    }

    override suspend fun getInitialJob(): Result<Job> = try {
        Result.Success(squireJobDataHelper.job())
    } catch (ex: java.lang.Exception) {
        Result.Error(ex)
    }

    override suspend fun getJob(jobId: JobId): Job = when (jobId) {
        JobId.SQUIRE -> squireJobDataHelper.job()
        JobId.CHEMIST -> chemistJobDataHelper.job()
        JobId.ARCHER -> archerJobDataHelper.job()
        else -> squireJobDataHelper.job()
    }

}