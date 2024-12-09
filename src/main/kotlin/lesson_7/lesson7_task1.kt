package org.example.lesson_7

import kotlin.random.Random

fun generatePassword(length: Int): String {

    val chars = ('a'..'z').toList()
    val numbers = ('0'..'9').toList()
    val passwordBuilder = StringBuilder()

    for (i in 0 until length) {
        if (i % 2 == 0) {
            val randomChars = chars[Random.nextInt(chars.size)]
            passwordBuilder.append(randomChars)
        } else {
            val randomNumbers = numbers[Random.nextInt(numbers.size)]
            passwordBuilder.append(randomNumbers)
        }
    }

    return passwordBuilder.toString()

}

fun main() {

    val passwordSize = 6
    println(generatePassword(passwordSize))

}





