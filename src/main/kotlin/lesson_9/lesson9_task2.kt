package org.example.lesson_9

const val IS_YES = "да"
const val IS_NO = "нет"

fun main() {

    val ingridients = mutableListOf("мука", "сахар", "соль")
    println("В рецепте есть базовые ингредиенты: $ingridients")

    println("Желаете добавить ещё?")
    val answer = readln()

    if (answer.equals(IS_NO, ignoreCase = true)) return

    if (answer.equals(IS_YES, ignoreCase = true)) {
        println("Какой ингридиент вы хотите добавить?")
        val inputIngridient = readln()
        ingridients.add(inputIngridient)
    } else return
    println("Теперь в рецепте есть следующие ингредиенты: $ingridients")
}