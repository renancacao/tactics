package com.rcacao.tactics.teambuild.data.soldier.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.rcacao.tactics.core.domain.job.JobId
import com.rcacao.tactics.core.domain.soldier.Sex
import com.rcacao.tactics.core.domain.zodiac.Zodiac

@Entity(tableName = "soldiersData")
class DBSoldier(
    @PrimaryKey(autoGenerate = true) var id: Int,
    val name: String,
    val zodiac: Zodiac,
    val sex: Sex,
    var brave: Int,
    var faith: Int,
    val rawHp: Int,
    val rawMp: Int,
    val rawSpeed: Int,
    val rawPAtk: Int,
    val rawPMgk: Int,
    val jobId: JobId,
    val hp: Int,
    val mp: Int,
    val sp: Int,
    val pa: Int,
    val ma: Int
) {

}
