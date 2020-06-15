package com.rcacao.tactics.teambuild.view.ui.mapper

import com.rcacao.tactics.core.data.soldier.model.Soldier
import com.rcacao.tactics.resources.ResourceProvider
import com.rcacao.tactics.teambuild.view.ui.model.UiSoldier
import javax.inject.Inject

class UiSoldierMapper @Inject constructor(private val resProvider: ResourceProvider) {

    fun map(soldiers: List<Soldier>): List<UiSoldier> {
        val uiSoldiers: MutableList<UiSoldier> =
            soldiers.map {
                UiSoldier(
                    it.id,
                    it.stats.hp,
                    resProvider.standPose(it.job.id, it.sex)
                )
            } as MutableList<UiSoldier>
        uiSoldiers.add(UiSoldier())
        return uiSoldiers
    }

}