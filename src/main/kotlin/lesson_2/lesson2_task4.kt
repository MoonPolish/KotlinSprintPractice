package org.example.lesson_2

const val ONE_HUNDRED_PERCENT = 100

fun main() {

    val buffPercentage = 20

    val crystalOre = 7
    val metalOre = 11

    val bonusCrystalOre = crystalOre * buffPercentage / ONE_HUNDRED_PERCENT
    val bonusMetalOre = metalOre * buffPercentage / ONE_HUNDRED_PERCENT

    println("Бонус кристаллической руды составит: +$bonusCrystalOre")
    println("Бонус металлической руды составит: +$bonusMetalOre")

}