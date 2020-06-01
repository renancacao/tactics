package com.rcacao.tactics.core.data.job.datasource

import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.core.data.job.Job

class JobGameDataSource(
    private val squireJobDataHelper: JobDataHelper,
    private val chemistJobDataHelper: JobDataHelper,
    private val archerJobDataHelper: JobDataHelper
) : JobDataSource {

    override suspend fun getJobs(): Result<List<Job>> {
        return try {
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
    }

    override suspend fun getInitialJob(): Result<Job> {
        return try {
            Result.Success(squireJobDataHelper.job())
        } catch (ex: java.lang.Exception) {
            Result.Error(ex)
        }
    }

}