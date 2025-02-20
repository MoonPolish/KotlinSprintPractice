package org.example.lesson_12

import kotlin.random.Random

class WeatherData4(
    val dayTemperature: Double,
    val nighTemperature: Double,
    val hasPrecipitation: Boolean,
) {

}

fun main() {
    val weatherList = mutableListOf<WeatherData4>()

    for (i in 1..30) {
        val dayTemp = Random.nextDouble(7.0, 26.0)
        val nightTemp = Random.nextDouble(5.0, 16.0)
        val hasPrecip = Random.nextBoolean()

        weatherList.add(WeatherData4(dayTemp, nightTemp, hasPrecip))
    }

    val dayTemperatures = weatherList.map { it.dayTemperature }
    val nightTemperatures = weatherList.map { it.nighTemperature }

    val averageDayTemperature = dayTemperatures.average()
    val averageNightTemperature = nightTemperatures.average()

    val precipitationDaysCount = weatherList.count { it.hasPrecipitation }

    println("Средняя дневная температура: ${averageDayTemperature}")
    println("Средняя ночная температура: ${averageNightTemperature}")
    println("Количество дней с осадками: ${precipitationDaysCount}")

}