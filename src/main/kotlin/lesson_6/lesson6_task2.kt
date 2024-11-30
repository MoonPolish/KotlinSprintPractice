package org.example.lesson_6

fun main() {

    println("Введите количество секунд, которые Вы хотите засечь:")
    val secondsInput = readln().toInt()
    var seconds = secondsInput

    while (seconds > 0) {
        Thread.sleep(1000)
        seconds--
    }
    println("Прошло $secondsInput секунд(ы).")
}