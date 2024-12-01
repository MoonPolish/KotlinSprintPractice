package org.example.lesson_6

import kotlin.random.Random

fun main() {

    var attempts = 5
    val hiddenNumber = Random.nextInt(1, 10)

    println("Угадайте число от 1 до 9. Осталось попыток $attempts")

    while (attempts > 0) {
        println("Введите число: ")
        val inputNumber = readln().toInt()

        if (inputNumber == 0 || inputNumber < 1 || inputNumber > 9) {
            println("Пожалуйста, введите целое число от 1 до 9.")
            continue
        }
        if (inputNumber == hiddenNumber) {
            println("Это была великолепная игра!")
            return
        } else {
            attempts--
            println("Неверно. Осталось $attempts попыток.")
        }
    }
    println("Было загадано число $hiddenNumber.")
}






