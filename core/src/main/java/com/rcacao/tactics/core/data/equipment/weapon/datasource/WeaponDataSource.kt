package com.rcacao.tactics.core.data.equipment.weapon.datasource

import com.rcacao.tactics.core.data.equipment.weapon.Weapon
import com.rcacao.tactics.core.data.equipment.weapon.WeaponId
import com.rcacao.tactics.core.data.equipment.weapon.WeaponType

interface WeaponDataSource {
    fun getWeapon(weaponType: WeaponType, weaponId: WeaponId): Weapon
}