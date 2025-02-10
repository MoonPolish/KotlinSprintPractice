package org.example.lesson_11

class User (
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {

}

fun main() {

    val user1 = User(

        id = 1,
        login = "DobriyBrobovik",
        password = "randoMPassWord127",
        email = "DobriyBrobovik@gmail.com",

    )

    val user2 = User(

        id = 2,
        login = "kvadrober",
        password = "kvadrober230_032",
        email = "randommail@gmail.com"

    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)

    println()

    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.email)

}