package com.rcacao.tactics.core.data.job.datasource

import com.rcacao.tactics.core.data.job.Job

class JobGameDataSource(
    private val squireJobDataHelper: JobDataHelper,
    private val chemistJobDataHelper: JobDataHelper,
    private val archerJobDataHelper: JobDataHelper
) {

    fun getJobs(): List<Job> {
        return listOf(
            squireJobDataHelper.job(),
            chemistJobDataHelper.job(),
            archerJobDataHelper.job()
        )
    }

}