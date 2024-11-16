package org.example.lesson_2

fun main() {

    val buffPercentage = 1.2

    val crystalOre = 7
    val metalOre = 11

    val bonusCrystalOre = (crystalOre * buffPercentage - crystalOre).toInt()
    val bonusMetalOre = (metalOre * buffPercentage - metalOre).toInt()

    println("Бонус кристаллической руды составит: +$bonusCrystalOre")
    println("Бонус металлической руды составит: +$bonusMetalOre")

}