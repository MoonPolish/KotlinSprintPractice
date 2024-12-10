package org.example.lesson_8

fun main() {

    val ingridients = arrayOf("яйцо", "помидор", "зелень", "соль", "перец")
    println(ingridients.joinToString(", "))

    println("Введите ингридиент, который Вы хотели бы заменить: ")
    val inputIngridient = readln()

    if (inputIngridient != null) {
        val index = ingridients.indexOf(inputIngridient)

        if (index == -1) {
            println("Ингридиента '$inputIngridient' нет в списке")
        } else {
            println("Введите ингридиент, который Вы хотите добавить вместо '$inputIngridient'")
            val newIngridient = readln()

            if (newIngridient != null) {
                ingridients[index] = newIngridient
                println("Готово! Вы сохранили следующий список: ${ingridients.joinToString(", ")}")
            } else {
                println("Вы не ввели новый ингридиент.")
            }
        }
    } else {
        println("Вы не ввели ингридиент для замены.")
    }
}
