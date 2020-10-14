package com.rcacao.tactics.core.data.job.datasource

import com.rcacao.tactics.core.data.job.JobId
import com.rcacao.tactics.core.data.job.jobs.Archer
import com.rcacao.tactics.core.data.job.jobs.Chemist
import com.rcacao.tactics.core.data.job.jobs.Job
import com.rcacao.tactics.core.data.job.jobs.Squire

class JobGameDataSourceImpl : JobDataSource {

    override fun getJobs(): List<Job> = listOf(Squire, Chemist, Archer)

    override fun job(jobId: JobId): Job = when (jobId) {
        JobId.SQUIRE -> Squire
        JobId.CHEMIST -> Chemist
        JobId.ARCHER -> Archer
    }

}