package org.example.lesson_9

const val QUANTITY_OF_INGRIDIENTS = 5

fun main() {

    println("Введите 5 ингридиентов через запятую и пробел:")
    val inputIngridients = readln()
    val ingridients = inputIngridients.split(", ")
    val sortedIngridients = ingridients.sorted()

    for (ingridient in sortedIngridients) {
        if (sortedIngridients.size == QUANTITY_OF_INGRIDIENTS) {
            println(ingridient)
        }
    }
}