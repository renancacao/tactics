package com.rcacao.tactics.teambuild.data.soldier.datasource

import com.rcacao.tactics.core.data.soldier.RawStats
import com.rcacao.tactics.core.data.soldier.Sex

interface RawStatsHelper {
    fun getRawStats(sex: Sex): RawStats
}
