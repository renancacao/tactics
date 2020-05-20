package com.rcacao.tactics.data.skills.actions

import com.rcacao.tactics.data.jobs.JobId

class ActionDataSource() {

    fun actions(jobId: JobId): List<Action> {
        return when (jobId) {
            JobId.SQUIRE -> listOf(Attack.Focus, Attack.Rush, Attack.Stone, Attack.Salve)
            JobId.CHEMIST -> listOf(Item.Potion, Item.HiPotion, Item.XPotion, Item.PhoenixDown)
            JobId.ARCHER -> listOf(
                Aim.Aim1,
                Aim.Aim2,
                Aim.Aim3,
                Aim.Aim4,
                Aim.Aim5,
                Aim.Aim7,
                Aim.Aim10,
                Aim.Aim20
            )
        }
    }

}