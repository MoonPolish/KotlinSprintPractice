package org.example.lesson_7

fun main() {

    println("Введите количество секунд, которое хотите засечь: ")
    var inputSecond = readln().toInt()

    for (i in 1..inputSecond) {
        Thread.sleep(1000)
        println("Осталось секунд: ${inputSecond--}")
    }
    println("Время вышло.")
}
