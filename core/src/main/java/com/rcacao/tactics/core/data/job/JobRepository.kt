package com.rcacao.tactics.core.data.job

import com.rcacao.tactics.core.data.Result

interface JobRepository {
    suspend fun getJob(): Result<Job>
}