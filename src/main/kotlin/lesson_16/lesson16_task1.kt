package org.example.lesson_16

import kotlin.random.Random

class Dice {
    private val number: Int = Random.nextInt(1, 7)

    fun roll() {
        println("Выпало число: $number")
    }
}

fun main() {
    val dice = Dice()
    dice.roll()
}
