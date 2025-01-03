package org.example.lesson_10

fun generatePassword(lenthg: Int): String {

    val digits = ('0'..'9').toList()
    val specialCharacters = listOf('!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ' ')
    val passwordBuilder = StringBuilder()

    for (i in 0 until lenthg) {
        if (i % 2 == 0) {
            val randomDigit = digits.random()
            passwordBuilder.append(randomDigit)
        } else {
            val randomSpecialChar = specialCharacters.random()
            passwordBuilder.append(randomSpecialChar)
        }
    }
    return passwordBuilder.toString()
}

fun main() {

    println("Введите длину пароля, который необходимо сгенерировать: ")
    val length = readln().toInt()

    if (length == 0 || length < 0) {
        println("Ошибка. Длина пароля не должна быть равна 0 или иметь отрицательное значение.")
        return
    }

    val password = generatePassword(length)
    println(password)
}
