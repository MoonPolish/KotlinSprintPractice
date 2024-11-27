package org.example.lesson_5

const val SHIP_NAME = "Heart of Gold"

const val LOGIN = "Zaphod"
const val PASSWORD = "PanGalactic"

fun main() {

    var androidMarvin = """        
        Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля 
        "$SHIP_NAME". [вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к 
        процессу входа. Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не 
        заботитесь. [вздыхает ещё глубже...] Да, вперед, пожалуйста, вводите свои данные... 
    """.trimIndent()

    println(androidMarvin)

    val inputLogin = readln()
    val inputPassword = readln()

    androidMarvin = if (inputLogin == LOGIN) {
        inputPassword
    } else if (inputPassword == PASSWORD) {
        """
            [вздыхает...] Ваши данные проверены, и о, чудо, они верны... Пользователь "$LOGIN", вам разрешено входить 
            на борт корабля "$SHIP_NAME". Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце 
            концов... [меланхолический вздох...] Надеюсь, вам понравится пребывание здесь больше, чем мне.
        """.trimIndent()
    } else {
        "Предложить пользователю $inputLogin регистрацию."
    }

    println(androidMarvin)

}