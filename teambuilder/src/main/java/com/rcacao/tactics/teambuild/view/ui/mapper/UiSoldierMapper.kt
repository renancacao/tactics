package com.rcacao.tactics.teambuild.view.ui.mapper

import com.rcacao.tactics.core.data.soldier.model.Soldier
import com.rcacao.tactics.resources.ResourceProvider
import com.rcacao.tactics.teambuild.view.ui.model.AddItem
import com.rcacao.tactics.teambuild.view.ui.model.SoldierListItem
import com.rcacao.tactics.teambuild.view.ui.model.UiSoldier
import javax.inject.Inject

class UiSoldierMapper @Inject constructor(private val resProvider: ResourceProvider) {

    fun map(soldiers: List<Soldier>): List<SoldierListItem> {
        val soldierList: MutableList<SoldierListItem> =
            soldiers.map {
                UiSoldier(
                    it.id,
                    it.name,
                    it.job.name,
                    it.stats.hp.toString(),
                    it.stats.mp.toString(),
                    it.brave.toString(),
                    it.faith.toString(),
                    resProvider.standPose(it.job.id, it.sex),
                    resProvider.portrait(it.job.id, it.sex),
                    resProvider.zodiacSymbol(it.zodiac)
                )
            }.toMutableList()

        soldierList.add(AddItem())
        return soldierList
    }

    fun map(soldier: Soldier): UiSoldier = UiSoldier(
        soldier.id,
        soldier.name,
        soldier.job.name,
        soldier.stats.hp.toString(),
        soldier.stats.mp.toString(),
        soldier.brave.toString(),
        soldier.faith.toString(),
        resProvider.standPose(soldier.job.id, soldier.sex),
        resProvider.portrait(soldier.job.id, soldier.sex),
        resProvider.zodiacSymbol(soldier.zodiac)
    )

}