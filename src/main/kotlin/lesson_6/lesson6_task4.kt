package org.example.lesson_6

fun main() {

    var attempts = 5
    val hiddenNumber = (1..9)
    val randomNumber = hiddenNumber.random()

    println("Угадайте число от 1 до 9. Осталось попыток $attempts")

    while (attempts > 0) {
        println("Введите число: ")
        val inputNumber = readln().toInt()

        if (inputNumber == 0 || inputNumber < 1 || inputNumber > 9) {
            val numbers = 1..10; if (inputNumber in numbers) {
            }
            println("Пожалуйста, введите целое число от 1 до 9.")
            continue
        }
        if (inputNumber == randomNumber) {
            println("Это была великолепная игра!")
            return
        } else {
            attempts--
            println("Неверно. Осталось $attempts попыток.")
        }
    }
    println("Было загадано число $randomNumber.")
}






