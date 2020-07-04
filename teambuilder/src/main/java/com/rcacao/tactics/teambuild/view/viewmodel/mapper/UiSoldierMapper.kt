package com.rcacao.tactics.teambuild.view.viewmodel.mapper

import com.rcacao.tactics.core.data.soldier.model.Soldier
import com.rcacao.tactics.resources.ResourceProvider
import com.rcacao.tactics.teambuild.view.model.UiSoldier
import com.rcacao.tactics.teambuild.view.ui.model.AddItem
import com.rcacao.tactics.teambuild.view.ui.model.SoldierListItem
import javax.inject.Inject

class UiSoldierMapper @Inject constructor(private val resProvider: ResourceProvider) {

    fun map(soldiers: List<Soldier>): List<SoldierListItem> {
        val soldierList: MutableList<SoldierListItem> =
            soldiers.map {
                mapSoldierToUiSoldier(it)
            }.toMutableList()

        soldierList.add(AddItem())
        return soldierList
    }

    fun map(soldier: Soldier): UiSoldier {
        return mapSoldierToUiSoldier(soldier)
    }

    private fun mapSoldierToUiSoldier(soldier: Soldier): UiSoldier {
        with(soldier) {
            return UiSoldier(
                id,
                name,
                job.name,
                stats.hp.toString(),
                stats.mp.toString(),
                brave.toString(),
                faith.toString(),
                resProvider.standPose(job.id, sex),
                resProvider.portrait(job.id, sex),
                resProvider.zodiacSymbol(zodiac),
                job.move,
                job.jump,
                stats.sp,
                0,
                0,
                0,
                0,
                stats.pa,
                stats.ma,
                job.pev,
                0,
                0,
                0,
                0,
                0
            )
        }
    }

}