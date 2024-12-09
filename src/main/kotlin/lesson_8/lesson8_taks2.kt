package org.example.lesson_8

fun main() {

    val ingridients = arrayOf("яйцо", "помидор", "зелень", "соль", "перец")

    print("Введите ингридиент, который Вы хотите найти: ")
    val inputIngridient = readln()
    var isTrue = false

    for (ingridient in ingridients) {
        if (ingridient == inputIngridient) {
            isTrue = true
            break
        }
    }
    if (isTrue) println("Ингредиент [$inputIngridient] в рецепте есть.")
    else println("Такого ингредиента в рецепте нет.")
}