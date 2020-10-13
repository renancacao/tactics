package com.rcacao.tactics.teambuild.domain.soldier

import com.rcacao.tactics.core.data.job.jobs.Job
import com.rcacao.tactics.core.domain.Result
import com.rcacao.tactics.teambuild.data.job.JobRepository
import javax.inject.Inject

class InitialJobUseCase @Inject constructor(private val jobRepository: JobRepository) {
    suspend operator fun invoke(): Result<Job> = jobRepository.getInitialJob()
}
