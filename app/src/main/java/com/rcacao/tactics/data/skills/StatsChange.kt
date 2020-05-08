package com.rcacao.tactics.data.skills


data class StatsChange(val stats: Stats, val value: StatsChangeValue, val target: Target) {
    constructor(stats: Stats, value: Int, target: Target) : this(
        stats,
        StatsChangeValue.Value(value),
        target
    )
}

