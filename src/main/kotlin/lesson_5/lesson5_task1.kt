package org.example.lesson_5

fun main() {
    val numberOne = 7
    val numberTwo = 4
    val sum = numberOne + numberTwo

    print("Решите эту задачу, чтобы подтвердить, что Вы не робот: $numberOne + $numberTwo = ")

    val userSum = readln().toInt()

    val resultText = if (userSum == sum) "Добро пожаловать!" else "Доступ запрещен."
    println(resultText)

}