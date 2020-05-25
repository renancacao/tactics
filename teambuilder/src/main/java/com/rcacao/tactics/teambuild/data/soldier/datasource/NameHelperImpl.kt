package com.rcacao.tactics.teambuild.data.soldier.datasource

import com.rcacao.tactics.core.data.soldier.Sex
import kotlin.random.Random

class NameHelperImpl : NameHelper {

    override fun getRandomName(sex: Sex): String {
        return when (sex) {
            Sex.MALE -> randomMaleName()
            Sex.FEMALE -> randomFemaleName()
        }
    }

    private fun randomMaleName(): String {

        val names: Array<String> = arrayOf(
            "Aaron",
            "Boston",
            "Carlo",
            "Dario",
            "Edward",
            "Fabricio",
            "Gustav",
            "Han",
            "Iriel",
            "John",
            "Kael",
            "Lucca",
            "Mones",
            "Noriel",
            "Otav",
            "Paul",
            "Renna",
            "Serj",
            "Tobias",
            "Urin",
            "Vanir",
            "William",
            "Xernes",
            "Yzz",
            "Zaion"
        )

        return names[Random.nextInt(0, names.size - 1)]

    }

    private fun randomFemaleName(): String {

        val names: Array<String> = arrayOf(
            "Anne",
            "Belly",
            "Celie",
            "Diana",
            "Ellie",
            "Fiona",
            "Gabi",
            "Hanna",
            "Iria",
            "Jess",
            "Kam",
            "Leila",
            "Maria",
            "Nadhia",
            "Orma",
            "Pris",
            "Rain",
            "Sabrina",
            "Tania",
            "Urma",
            "Veronic",
            "Wes",
            "Xenia",
            "Yvon",
            "Zaza"
        )

        return names[Random.nextInt(0, names.size - 1)]

    }

}
