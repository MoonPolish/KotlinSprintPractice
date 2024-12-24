package org.example.lesson_9

fun main() {

    println("Введите 5 ингридиентов через запятую и пробел:")
    val inputIngridients = readln()
    val ingridients = inputIngridients.split(", ").sorted()

    for (ingridient in ingridients) {
        println(ingridient)
    }
}
