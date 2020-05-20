package com.rcacao.tactics.data.skills.actions

import com.rcacao.tactics.data.jobs.Archer
import com.rcacao.tactics.data.jobs.Chemist
import com.rcacao.tactics.data.jobs.Job
import com.rcacao.tactics.data.jobs.Squire

class ActionDataSource {

    companion object {
        fun actions(job: Job): List<Action> {
            return when (job) {
                is Squire -> listOf(Attack.Focus, Attack.Rush, Attack.Stone, Attack.Salve)
                is Chemist -> listOf(Item.Potion, Item.HiPotion, Item.XPotion, Item.PhoenixDown)
                is Archer -> listOf(
                    Aim.Aim1,
                    Aim.Aim2,
                    Aim.Aim3,
                    Aim.Aim4,
                    Aim.Aim5,
                    Aim.Aim7,
                    Aim.Aim10,
                    Aim.Aim20
                )
                else -> emptyList()
            }
        }
    }

}