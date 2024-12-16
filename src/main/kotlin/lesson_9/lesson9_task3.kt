package org.example.lesson_9

fun main() {

    val ingridients = mutableListOf(2, 50, 15)

    println("Введите количество порций:")
    val inputPortions = readln().toInt()

    if (inputPortions != null && inputPortions > 0) {
        val quantityIngridients = ingridients.map { it * inputPortions }
        println(
            "На $inputPortions порций вам понадобится: Яиц – ${quantityIngridients[0]}, " +
                    "молока – ${quantityIngridients[1]} мл, сливочного масла – ${quantityIngridients[2]} гр."
        )
    } else {
        println("Пожалуйста, введите корректное количество порций.")
    }
}
