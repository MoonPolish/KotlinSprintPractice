package org.example.lesson_10

import kotlin.random.Random

fun main() {
    val humanRoll = rollDice("Человек")
    val computerRoll = rollDice("Компьютер")

    println("Результаты бросков:")
    println("Человек бросил кубик: $humanRoll")
    println("Компьютер бросил кубик: $computerRoll")

    when {
        humanRoll > computerRoll -> println("Победило Чловечество!")
        computerRoll > humanRoll -> println("Победила машина!")
        else -> println("Победила дружба!")
    }
}
fun rollDice(player: String): Int {
    val roll = Random.nextInt(1, 7)
    println("$player бросает кости...")
    return roll
}