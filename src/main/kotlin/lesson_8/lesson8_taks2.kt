package org.example.lesson_8

fun main() {

    val ingridients = arrayOf("яйцо", "помидор", "зелень", "соль", "перец")

    print("Введите ингридиент, который Вы хотите найти: ")
    val inputIngridient = readln()

    for (ingridient in ingridients) {
        if (ingridient == inputIngridient) {
            println("Ингредиент [$inputIngridient] в рецепте есть.")
        }
        println("Такого ингредиента в рецепте нет.")
        return
    }
}