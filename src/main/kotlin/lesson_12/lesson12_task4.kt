package org.example.lesson_12

const val KELVIN = 275.15

class WeatherData3(
    _dayTemperature: Double,
    _nightTemperature: Double,
    _hasPrecipitation: Boolean,
) {
    val dayTemperature = (_dayTemperature - KELVIN).toInt()
    val nightTemperature = (_nightTemperature - KELVIN).toInt()
    val hasPrecipitation = _hasPrecipitation

    init {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Наличие осадков: ${if (hasPrecipitation) "Да" else "Нет"}")
        println()
    }
}

fun main() {
    val weather1 = WeatherData3(
        309.12,
        281.45,
        true,
    )

    val weather2 = WeatherData3(
        210.98,
        190.365,
        false,
    )

}