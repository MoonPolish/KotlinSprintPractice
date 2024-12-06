package org.example.lesson_6

import kotlin.random.Random

fun main() {

    var attempts = 3

    println("Авторизация нового пользователя. Введите новый логин и пароль для регистрации: ")

    val newLogin = readln()
    val newPassword = readln()

    println("Введите свой логин и пароль, чтобы войти в систему: ")

    do {
        val login = readln()
        val password = readln()

        if (login != newLogin || password != newPassword) {
            println("Неверный логин или пароль. Пожалуйста, введите данные заново.")
            continue
        }
        println("Авторизация прошла успешно.")

        while (attempts > 0) {
            val num1 = Random.nextInt(1, 10)
            val num2 = Random.nextInt(1, 10)
            val sum = num1 + num2
            print("Докажите, что Вы не робот и решите простой пример: $num1 + $num2 = ")
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
    } while (attempts > 0)
}
