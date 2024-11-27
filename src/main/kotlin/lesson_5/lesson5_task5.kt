package org.example.lesson_5

import kotlin.random.Random

const val JACKPOT = 3
const val LUCKY_PRIZE = 2
const val CONSOLATION_PRIZE = 1

fun main() {

    val randomLotteryNumbers = mutableListOf<Int>()

    repeat(3) {
        val randomLotteryNumber = Random.nextInt(43)
        randomLotteryNumbers.add(randomLotteryNumber)
    }

    val enteredNumbers = mutableListOf<Int>()

    repeat(3) {
        val enterNumber = readln().toInt()
        enteredNumbers.add(enterNumber)
    }

    val intersection = randomLotteryNumbers.intersect(enteredNumbers)
    val result = intersection.size

    val resultText = when(result) {
        JACKPOT -> "Поздравляем! Вы угадали все три числа! Джекпот!"
        LUCKY_PRIZE -> "Великолепно! Вы отгадали два числа и получили крупный приз!"
        CONSOLATION_PRIZE -> "Вы выиграли утешительный приз."
        else -> "Вы не отгадали ни одного числа."
    }

    println("$resultText Выигрышные числа: $randomLotteryNumbers")

}