package org.example.lesson_9

import java.util.*

fun main() {

    val ingredientsSet = mutableSetOf<String>()

    println("Введите 5 названий ингридиентов по отдельности:")

    for (i in 1..5) {
        println("Введите $i-й ингридиент")
        val ingridient = readln().trim()
        if (ingridient != null && ingridient.isNotEmpty()) {
            ingredientsSet.add(ingridient)
        }
    }

    val sortedIngridients = ingredientsSet.toList().sorted()

    val result = sortedIngridients.joinToString(", ") {
        if (it == sortedIngridients.first())
            it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() } else it
    }
    println(result)
}