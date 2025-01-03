package org.example.lesson_10

fun main() {

    println("Введите логин: ")
    val login = readln()
    checkLength(login)

    println("Введите пароль: ")
    val password = readln()
    checkLength(password)

    println(checkLength(login))
    println(checkLength(password))
}

fun checkLength(lengths: String) {
    return if (lengths.length >= 4) {
        println()
    } else {
        println("Логин или пароль недостаточно длинные.")
    }
}