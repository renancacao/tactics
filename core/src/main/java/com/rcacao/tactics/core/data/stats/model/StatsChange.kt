package com.rcacao.tactics.core.data.stats.model

import com.rcacao.tactics.core.domain.skill.SkillTarget
import com.rcacao.tactics.core.domain.stats.Stats
import com.rcacao.tactics.core.domain.stats.StatsChangeValue

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

