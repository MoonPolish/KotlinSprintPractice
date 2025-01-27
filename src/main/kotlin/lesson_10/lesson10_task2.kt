package org.example.lesson_10

const val MIN_LENGTH = 4

fun main() {

    println("Введите логин: ")
    val login = readln()
    validateLength(login)

    println("Введите пароль: ")
    val password = readln()
    validateLength(password)

    if (validateLength(login) && validateLength(password)) {
        println("Добро пожаловать!")
    } else {
        println("Логин или пароль недостаточно длинные.")
    }

}

fun validateLength(lengths: String): Boolean {
    return (lengths.length >= MIN_LENGTH)

}