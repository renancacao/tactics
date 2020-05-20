package com.rcacao.tactics.data.skills.support

import com.rcacao.tactics.data.jobs.JobId

class SupportDataSource() {

    fun supports(jobId: JobId): List<Support> {
        return when (jobId) {
            JobId.SQUIRE -> listOf(Support.Defend, Support.EquipAxes, Support.JPBoost)
            JobId.CHEMIST -> listOf(Support.ThrowItem, Support.Reequip, Support.Safeguard)
            JobId.ARCHER -> listOf(Support.EquipCrossbows, Support.Concentrate)
        }
    }

}