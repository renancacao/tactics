package com.rcacao.tactics.core.data.stats

import com.rcacao.tactics.core.data.skill.SkillTarget

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

