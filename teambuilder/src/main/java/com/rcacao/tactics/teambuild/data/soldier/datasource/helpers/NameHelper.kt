package com.rcacao.tactics.teambuild.data.soldier.datasource.helpers

import com.rcacao.tactics.core.data.soldier.Sex

interface NameHelper {
    fun getRandomName(sex: Sex): String
}
