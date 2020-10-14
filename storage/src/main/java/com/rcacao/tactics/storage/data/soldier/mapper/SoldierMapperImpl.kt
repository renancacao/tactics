package com.rcacao.tactics.storage.data.soldier.mapper

import com.rcacao.tactics.core.data.job.datasource.JobDataSource
import com.rcacao.tactics.core.data.soldier.RawStats
import com.rcacao.tactics.core.data.soldier.Soldier
import com.rcacao.tactics.core.data.soldier.SoldierStats
import com.rcacao.tactics.storage.data.soldier.database.SoldierDTO
import javax.inject.Inject

class SoldierMapperImpl @Inject constructor(private val jobDataSource: JobDataSource) :
    SoldierMapper {

    override fun mapSoldier(soldierDTO: SoldierDTO): Soldier =
        Soldier(
            id = soldierDTO.id,
            name = soldierDTO.name,
            zodiac = soldierDTO.zodiac,
            sex = soldierDTO.sex,
            brave = soldierDTO.brave,
            faith = soldierDTO.faith,
            rawStats = RawStats(
                rawHp = soldierDTO.rawHp,
                rawMp = soldierDTO.rawMp,
                rawSpeed = soldierDTO.rawSpeed,
                rawPAtk = soldierDTO.rawPAtk,
                rawPMgk = soldierDTO.rawPMgk
            ),
            job = jobDataSource.job(soldierDTO.jobId),
            stats = SoldierStats(
                hp = soldierDTO.hp,
                mp = soldierDTO.mp,
                sp = soldierDTO.sp,
                pa = soldierDTO.pa,
                ma = soldierDTO.ma
            )
        )

    override fun mapSoldierDTO(soldier: Soldier): SoldierDTO =
        SoldierDTO(
            id = soldier.id,
            name = soldier.name,
            zodiac = soldier.zodiac,
            sex = soldier.sex,
            brave = soldier.brave,
            faith = soldier.faith,
            rawHp = soldier.rawStats.rawHp,
            rawMp = soldier.rawStats.rawMp,
            rawSpeed = soldier.rawStats.rawSpeed,
            rawPAtk = soldier.rawStats.rawPAtk,
            rawPMgk = soldier.rawStats.rawPMgk,
            jobId = soldier.job.id,
            hp = soldier.stats.hp,
            mp = soldier.stats.mp,
            sp = soldier.stats.sp,
            pa = soldier.stats.pa,
            ma = soldier.stats.ma
        )
}