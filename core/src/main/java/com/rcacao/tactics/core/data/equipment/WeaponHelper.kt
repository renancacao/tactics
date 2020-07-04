package com.rcacao.tactics.core.data.equipment

import com.rcacao.tactics.core.data.status.model.StatusOperation
import com.rcacao.tactics.core.domain.equipment.WeaponId
import com.rcacao.tactics.core.domain.equipment.WeaponType
import com.rcacao.tactics.core.domain.status.Status
import com.rcacao.tactics.core.domain.status.StatusEffect

class WeaponHelper {

    fun getWeapon(weaponType: WeaponType, weaponId: WeaponId): Weapon = when (weaponType) {
        WeaponType.DAGGER -> getDaggers(weaponId)
    }

    private fun getDaggers(weaponId: WeaponId): Dagger = when (weaponId) {
        WeaponId.DAGGER -> Dagger(weaponId, "Dagger", 3, 0, 100, 1)
        WeaponId.MYTHRIL_KNIFE -> Dagger(weaponId, "Mythril Knife", 4, 5, 500, 3)
        WeaponId.BLIND_KNIFE -> Dagger(
            weaponId,
            "Blind Knife",
            4,
            5,
            800,
            7,
            listOf(StatusEffect(Status.DARKNESS, StatusOperation.ADD, 25))
        )
        WeaponId.MAGE_MASHER -> TODO()
        WeaponId.PLATINA_DAGGER -> TODO()
        WeaponId.MAIN_GAUCHE -> TODO()
        WeaponId.ORICHALCUM -> TODO()
        WeaponId.ASSASSIN_DAGGER -> TODO()
        WeaponId.AIR_KNIFE -> TODO()
        WeaponId.ZORLIN_SHAPE -> TODO()
    }

},