package org.example.lesson_9

fun main() {

    val ingridients = listOf("мука", "сыр", "сахар", "соль", "яйца", "перец")
    println("В рецепте есть следующие ингридиенты: ${ingridients}")

    ingridients.forEach {
        println(it)
    }

}