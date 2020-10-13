package com.rcacao.tactics.teambuild.data.soldier.datasource

import com.rcacao.tactics.core.data.job.jobs.Job
import com.rcacao.tactics.core.data.soldier.RawStats
import com.rcacao.tactics.core.data.soldier.SoldierStats
import javax.inject.Inject
import kotlin.math.max

class StatsCalculatorHelperImpl @Inject constructor() :
    StatsCalculatorHelper {

    /*
    * Este calculo bate com o do FFT sem levar em consideração que em cada mudança de level dentro
    * de um job, o acréscimo de stats será diferente. É como se o personagem nascesse já com o job
    * em questão e depois aumentou seu level até 50
     */

    private val divisor = 1638400
    private val currentLevel = 50

    override fun calculateStats(rawStats: RawStats, job: Job): SoldierStats =
        SoldierStats(
            hp = calculate(rawStats.rawHp, job.baseStats.baseHP, job.cStats.cHP),
            mp = calculate(rawStats.rawMp, job.baseStats.baseMP, job.cStats.cMP),
            sp = calculate(rawStats.rawSpeed, job.baseStats.baseSpeed, job.cStats.cSpeed),
            pa = calculate(rawStats.rawPAtk, job.baseStats.baseAttack, job.cStats.cAttack),
            ma = calculate(rawStats.rawPMgk, job.baseStats.baseMagick, job.cStats.cMagick)
        )

    private fun calculate(rawStat: Int, jobMultiplier: Int, c: Int): Int =
        max(
            ((rawStat + getLevelBonus(rawStat, c, currentLevel)) * jobMultiplier) / divisor,
            1
        )

    private fun getLevelBonus(rawStat: Int, c: Int, level: Int): Int =
        (rawStat / (c + level - 1)) * level

}
