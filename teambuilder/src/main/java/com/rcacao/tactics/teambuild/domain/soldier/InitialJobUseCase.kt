package com.rcacao.tactics.teambuild.domain.soldier

import com.rcacao.tactics.core.data.Result
import com.rcacao.tactics.core.data.job.Job
import com.rcacao.tactics.core.data.job.JobRepository

class InitialJobUseCase(private val jobRepository: JobRepository) {
    suspend operator fun invoke(): Result<Job> = jobRepository.getJob()
}
