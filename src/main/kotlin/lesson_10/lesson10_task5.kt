package org.example.lesson_10

const val VALID_LOGIN = "User"
const val VALID_PASSWORD = "Password"

var accessToken: String? = null

val shoppingCart = listOf("мазек", "кукурука", "тунес")

fun authorize(username: String, password: String): String? {
    return if (username == VALID_LOGIN && password == VALID_PASSWORD) {
        "token12345"
    } else {
        null
    }
}

fun getShoppingCart(token: String?): List<String>? {
    return if (token == accessToken) {
        shoppingCart
    } else {
        null
    }
}

fun main() {

    val username = "User"
    val password = "Password"

    accessToken = authorize(username, password)

    val cartItems = getShoppingCart(accessToken)

    if (cartItems != null) {
        println("Содержимое корзины: $shoppingCart")
    } else {
        println("Неудачная авторизация. Проверьте логин или пароль.")
    }
}