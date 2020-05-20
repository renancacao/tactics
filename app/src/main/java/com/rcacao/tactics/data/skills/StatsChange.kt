package com.rcacao.tactics.data.skills

data class StatsChange(
    val stats: Stats,
    val value: StatsChangeValue,
    val skillTarget: SkillTarget
) {
    constructor(stats: Stats, value: Int, skillTarget: SkillTarget) : this(
        stats,
        StatsChangeValue.Value(value),
        skillTarget
    )
}

