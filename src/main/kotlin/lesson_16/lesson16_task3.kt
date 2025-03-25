package org.example.lesson_16

class User(
    val login: String,
    private val passwordHash: String,
) {
    fun isPasswordValid(passwordToCheck: String): Boolean {
        return passwordToCheck.hashCode() == passwordHash.toInt()
    }
}

fun main() {
    val user = User("login", "password".hashCode().toString())

    println("Введите пароль:")
    val inputPassword = readln() ?: ""

    if (user.isPasswordValid(inputPassword)) {
        println("Пароль верный.")
    } else {
        println("Пароль неверный.")
    }
}