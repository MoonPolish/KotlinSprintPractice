package org.example.lesson_10

import kotlin.random.Random

const val VALID_LOGIN = "User"
const val VALID_PASSWORD = "Password"

var token: String? = null

val shoppingCart = mutableListOf("мазек", "кукурука", "тунес")

fun generateRandomToken(length: Int): String {
    val characters = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    return (1..length).joinToString("") { characters[Random.nextInt(characters.size)].toString() }
}

fun authorize(username: String, password: String): String? {
    return if (username == VALID_LOGIN && password == VALID_PASSWORD) {
        token = generateRandomToken(32)
        token
    } else {
        null
    }
}

fun getShoppingCart(token: String): MutableList<String>? {
    return if (token != null) {
        shoppingCart
    } else {
        null
    }
}

fun main() {

    println("Введите логин и пароль:")

    val username = readln()
    val password = readln()

    val accessToken = authorize(username, password)

    if (accessToken != null) {
        println("Авторизация успешна.")
        val shoppingCart = getShoppingCart(accessToken)
        println("Содержимое корзины: $shoppingCart")
    } else {
        println("Неудачная авторизация. Проверьте логин или пароль.")
    }
}
