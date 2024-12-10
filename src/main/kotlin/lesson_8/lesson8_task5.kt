package org.example.lesson_8

fun main() {

    println("Введите количество ингридиентов:")
    val size = readln().toInt()

    val array = Array(size) { "" }

    for (i in 0 until size) {
        println("Введите ингридиент #${i + 1}:")
        array[i] = readln()
    }
    println("Вы сохранили следующие ингридиенты: ${array.joinToString(", ")}")
}