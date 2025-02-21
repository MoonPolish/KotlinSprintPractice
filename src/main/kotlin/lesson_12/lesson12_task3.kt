package org.example.lesson_12

const val KELVIN = 273

class WeatherData2(
    _dayTemperature: Int,
    _nightTemperature: Int,
    _hasPrecipitation: Boolean,
) {
    val dayTemperature = (_dayTemperature - KELVIN).toInt()
    val nightTemperature = (_nightTemperature - KELVIN).toInt()
    val hasPrecipitation = _hasPrecipitation

    fun displayWeather() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Наличие осадков: ${if (hasPrecipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val weather1 = WeatherData2(
        309,
        281,
        true,
    )

    val weather2 = WeatherData2(
        210,
        190,
        false,
    )

    println("Данные о погоде на первый день:")
    weather1.displayWeather()
    println("\nДанные о погоде на второй день:")
    weather2.displayWeather()
}