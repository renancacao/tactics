package com.rcacao.tactics.teambuild.data.soldier.datasource

import com.rcacao.tactics.core.data.soldier.model.RawStats
import com.rcacao.tactics.core.domain.soldier.Sex

interface RawStatsHelper {
    fun getRawStats(sex: Sex): RawStats
}
