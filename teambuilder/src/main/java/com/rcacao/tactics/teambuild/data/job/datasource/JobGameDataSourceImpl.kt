package com.rcacao.tactics.teambuild.data.job.datasource

import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.core.data.job.model.Job
import com.rcacao.tactics.core.domain.job.JobId
import javax.inject.Inject

class JobGameDataSourceImpl @Inject constructor(private val jobDataHelpers: MutableList<JobDataHelper>) :
    JobDataSource {

    override suspend fun getJobs(): Result<List<Job>> = try {
        val jobs: ArrayList<Job> = ArrayList()
        jobDataHelpers.forEach { jobs.add(it.job()) }
        Result.Success(jobs)
    } catch (ex: Exception) {
        Result.Error(ex)
    }

    override suspend fun getInitialJob(): Result<Job> = getJob(JobId.SQUIRE)

    override suspend fun getJob(jobId: JobId): Result<Job> = try {
        val job: Job? = jobDataHelpers.find { it.id == JobId.SQUIRE }?.job()
        if (job != null) {
            Result.Success(job)
        } else {
            Result.Error(Exception(jobId.name + " Job not finding"))
        }
    } catch (ex: java.lang.Exception) {
        Result.Error(ex)
    }

}