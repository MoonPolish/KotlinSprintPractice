package org.example.lesson_7

fun main() {

    val numbers = 1000..9999

    do {
        val randomNumber = numbers.random()
        println("Ваш код авторизации: $randomNumber")
        val inputNumber = readln().toInt()

        if (inputNumber != randomNumber) {
            continue
        }
    } while (inputNumber != randomNumber)
    return
}


