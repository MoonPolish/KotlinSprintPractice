package org.example.lesson_10

import kotlin.random.Random

fun main() {

    var userWins = 0
    var continuePlaying = true

    while (continuePlaying) {
        val roundResult = playRound()
        if (roundResult == 1) {
            userWins++
            println("Вы выиграли этот раунд!")
        } else if (roundResult == 0) {
            println("Компьютер выиграл этот раунд!")
        } else {
            println("Ничья.")
        }

        println("Хотите бросить кости ещё раз? Введите Да или Нет:")
        val response = readln()
        continuePlaying = response.equals("Да", ignoreCase = true)
    }

    println("Игра завершена. Вы выиграли $userWins партий.")

}

fun playRound(): Int {

    val userRoll = rollDice()
    val computerRoll = rollDice()

    println("Вы бросили: $userRoll")
    println("Компьютер бросил: $computerRoll")

    return when {
        userRoll > computerRoll -> 1 // пользователь победил
        userRoll < computerRoll -> 0 // компьютер победил
        else -> -1 // ничья
    }

}

fun rollDice(): Int {
    return Random.nextInt(1, 10)

}