package org.example.lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {

    print("Введите год рождения: ")
    val yearOfBirth = readln().toInt()

    val cuurentDate = LocalDate.now()
    val currentYear = cuurentDate.year

    val howOld = currentYear - yearOfBirth

    val resultText = if (howOld >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом" else "Вам нет 18."
    println(resultText)

}