package com.rcacao.tactics.core.data.equipment.weapon.range

class ContactRange(belowHor: Int, belowVer: Int, aboveHor: Int, aboveVer: Int) :
    WeaponRange {
    private val belowRange: HeightContactRange =
        HeightContactRange(
            belowHor,
            belowVer
        )
    private val aboveRange: HeightContactRange =
        HeightContactRange(
            aboveHor,
            aboveVer
        )

    private class HeightContactRange(val horizontal: Int, val vertical: Int)

}
