package org.example.lesson_6

fun main() {

    println("Введите количество секунд, которые Вы хотите засечь:")
    var secondsInput = readln().toInt()

    while (secondsInput > 0) {
        Thread.sleep(1000)
        println("Осталось секунд: ${secondsInput--}")
    }
    println("Время вышло.")
}