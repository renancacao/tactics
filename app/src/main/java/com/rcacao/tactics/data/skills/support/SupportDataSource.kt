package com.rcacao.tactics.data.skills.support

import com.rcacao.tactics.data.jobs.Archer
import com.rcacao.tactics.data.jobs.Chemist
import com.rcacao.tactics.data.jobs.Job
import com.rcacao.tactics.data.jobs.Squire

class SupportDataSource {

    companion object {
        fun supports(job: Job): List<Support> {
            return when (job) {
                is Squire -> listOf(Support.Defend, Support.EquipAxes, Support.JPBoost)
                is Chemist -> listOf(Support.ThrowItem, Support.Reequip, Support.Safeguard)
                is Archer -> listOf(Support.EquipCrossbows, Support.Concentrate)
                else -> emptyList()
            }
        }
    }

}