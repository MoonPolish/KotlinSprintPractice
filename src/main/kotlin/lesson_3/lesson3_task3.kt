package org.example.lesson_3

fun main() {

    val multiplicand = 8
    val result = StringBuilder()

    for (i in 1..9) {
        result.append("$multiplicand x $i = ${multiplicand * i}\n")
    }

    println(result)

}