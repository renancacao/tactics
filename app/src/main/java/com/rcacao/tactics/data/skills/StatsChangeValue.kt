package com.rcacao.tactics.data.skills

sealed class StatsChangeValue {
    data class Value(val value: Int) : StatsChangeValue()
    data class Random(val min: Int, val max: Int) : StatsChangeValue()
}
