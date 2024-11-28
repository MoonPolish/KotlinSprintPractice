package org.example.lesson_5

const val ONE_HUNDRED = 100

fun main() {

    println("- Расстояние поездки (в километрах):")
    val travelDistance = readln().toFloat()

    println("- Расход топлива на 100 км (в литрах):")
    val fuelConsumption = readln().toFloat()

    println("- Текущая цена за литр топлива:")
    val currentPrice = readln().toFloat()

    val totalAmountOfFuel = (travelDistance * fuelConsumption) / ONE_HUNDRED
    val totalFuelCost = totalAmountOfFuel * currentPrice

    println(
        " - Общее количество необходимого топлива: ${
            String.format("%.2f", totalAmountOfFuel)
                .replace(',', '.')
        }"
    )
    println(" - Итоговая стоимость поездки: ${String.format("%.2f", totalFuelCost)}")

}