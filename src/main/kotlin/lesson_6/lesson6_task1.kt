package org.example.lesson_6

fun main() {

    println("Авторизация нового пользователя. Введите новый логин и пароль для регистрации: ")

    val newLogin = readln()
    val newPassword = readln()

    println("Введите свой логин и пароль, чтобы войти в систему: ")

    val login = readln()
    val password = readln()

    while (newLogin != login || newPassword != password) {
        login
        password
    }
    if (newLogin == login && newPassword == password) {
        println("Авторизация прошла успешно.")
    }
}


