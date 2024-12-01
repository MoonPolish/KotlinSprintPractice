package org.example.lesson_6

fun main() {

    println("Введите количество секунд, которые Вы хотите засечь:")
    val secondsInput = readln().toLong()

    Thread.sleep(1000 * secondsInput)

    println("Прошло $secondsInput секунд(ы).")
}
