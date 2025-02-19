package org.example.lesson_12

class WeatherData3(
    _dayTemperature: Int,
    _nightTemperature: Int,
    _hasPrecipitation: Boolean,
) {
    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var hasPrecipitation = _hasPrecipitation

    init {
        println("Дневная температура: ${dayTemperature - KELVIN}°C")
        println("Ночная температура: ${nightTemperature - KELVIN}°C")
        println("Наличие осадков: ${if (hasPrecipitation) "Да" else "Нет"}")
        println()
    }
}

fun main() {
    val weather1 = WeatherData3(
        309,
        281,
        true,
    )

    val weather2 = WeatherData3(
        210,
        190,
        false,
    )

}