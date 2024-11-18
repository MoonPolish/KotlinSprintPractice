package org.example.lesson_3

fun main() {

    val multiplicand = 8
    val factor = 9
    val result = StringBuilder()

    for (i in 1..factor) {
        result.append("$multiplicand x $i = ${multiplicand * i}\n")
    }

    println(result)

}