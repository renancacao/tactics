package com.rcacao.tactics.core.domain.equipment

class WeaponRange(belowHor: Int, belowVer: Int, aboveHor: Int, aboveVer: Int) {
    val belowRange: HeightWeaponRange = HeightWeaponRange(belowHor, belowVer)
    val aboveRange: HeightWeaponRange = HeightWeaponRange(aboveHor, aboveVer)
}
