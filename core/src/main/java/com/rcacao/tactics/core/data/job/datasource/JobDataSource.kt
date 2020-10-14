package com.rcacao.tactics.core.data.job.datasource

import com.rcacao.tactics.core.data.job.JobId
import com.rcacao.tactics.core.data.job.jobs.Job

interface JobDataSource {
    fun getJobs(): List<Job>
    fun job(jobId: JobId): Job
}