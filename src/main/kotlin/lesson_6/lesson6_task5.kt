package org.example.lesson_6

import kotlin.random.Random

fun main() {

    var attempts = 3

            while (attempts > 0) {
                val num1 = Random.nextInt(1, 10)
                val num2 = Random.nextInt(1, 10)
                print("Докажите, что Вы не робот и решите простой пример: $num1 + $num2 = ")
                val sum = num1 + num2
                val inputNumber = readln().toInt()

            if (inputNumber == sum) {
                println("Добро пожаловать!")
                return
            } else {
                attempts--
                println("Неверно. Осталось $attempts попыток.")
            }
        }
        println("Доступ запрещён.")
}
