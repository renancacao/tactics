package com.rcacao.tactics.core.data.equipment.weapon.datasource

import com.rcacao.tactics.core.data.equipment.weapon.Weapon
import com.rcacao.tactics.core.data.equipment.weapon.WeaponId
import com.rcacao.tactics.core.data.equipment.weapon.WeaponType
import com.rcacao.tactics.core.data.equipment.weapon.crossbow.BowGun
import com.rcacao.tactics.core.data.equipment.weapon.crossbow.CrossBow
import com.rcacao.tactics.core.data.equipment.weapon.crossbow.CrossBowId
import com.rcacao.tactics.core.data.equipment.weapon.crossbow.NightKiller
import com.rcacao.tactics.core.data.equipment.weapon.dagger.*
import com.rcacao.tactics.core.data.equipment.weapon.sword.BroadSword
import com.rcacao.tactics.core.data.equipment.weapon.sword.LongSword
import com.rcacao.tactics.core.data.equipment.weapon.sword.Sword
import com.rcacao.tactics.core.data.equipment.weapon.sword.SwordId

class WeaponDataSourceImpl :
    WeaponDataSource {

    override fun getWeapon(weaponType: WeaponType, weaponId: WeaponId): Weapon = when (weaponType) {
        WeaponType.DAGGER -> getDaggers(weaponId)
        WeaponType.SWORD -> getSwords(weaponId)
        WeaponType.CROSSBOW -> getCrossbow(weaponId)
    }

    private fun getSwords(weaponId: WeaponId): Sword = when (weaponId) {
        SwordId.BROAD_SWORD -> BroadSword
        SwordId.LONG_SWORD -> LongSword
        else -> TODO()
    }

    private fun getCrossbow(weaponId: WeaponId): CrossBow = when (weaponId) {
        CrossBowId.BOW_GUN -> BowGun
        CrossBowId.NIGHT_KILLER -> NightKiller
        else -> TODO()
    }

    private fun getDaggers(weaponId: WeaponId): Dagger = when (weaponId) {
        DaggerId.DAGGER -> SimpleDagger
        DaggerId.MYTHRIL_KNIFE -> MyrthrilKnife
        DaggerId.BLIND_KNIFE -> BlindKnife
        DaggerId.MAGE_MASHER -> MageMasher
        DaggerId.PLATINA_DAGGER -> PlatinaDagger
        DaggerId.MAIN_GAUCHE -> MainGauche
        DaggerId.ORICHALCUM -> Orichalcum
        DaggerId.ASSASSIN_DAGGER -> AssassinDagger
        DaggerId.AIR_KNIFE -> AirKnife
        DaggerId.ZORLIN_SHAPE -> ZorlinShape
        else -> TODO()
    }

}