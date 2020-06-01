package com.rcacao.tactics.core.domain.stats

sealed class StatsChangeValue {
    data class Value(val value: Int) : StatsChangeValue()
    data class Random(val min: Int, val max: Int) : StatsChangeValue()
}
