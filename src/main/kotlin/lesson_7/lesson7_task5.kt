package org.example.lesson_7

fun main() {

    val letters = ('a'..'z').toList()
    val numbers = ('0'..'9').toList()
    val capitalLetters = ('A'..'Z').toList()

    println("Введите длину пароля, который необходимо сгенерировать (минимум 6 символов): ")
    val passwordLength = readln().toInt()

    if (passwordLength < 6) {
        println("Длина пароля не может быть меньше 6.")
        return
    }

    val passwordChars = mutableListOf<Char>()

    passwordChars.add(letters.random())
    passwordChars.add(numbers.random())
    passwordChars.add(capitalLetters.random())

    val allChars = letters + numbers + capitalLetters
    for (i in 3 until passwordLength) {
        passwordChars.add(allChars.random())
    }
    passwordChars.shuffle()

    val generatedPassword = passwordChars.joinToString("")

    println(generatedPassword)
}