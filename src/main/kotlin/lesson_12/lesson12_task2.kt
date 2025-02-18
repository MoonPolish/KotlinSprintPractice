package org.example.lesson_12

class WeatherData1(
    var dayTemperature: Double,
    var nightTemperature: Double,
    var hasPrecipitation: Boolean,
) {

    fun displayWeather() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Наличие осадков: ${if (hasPrecipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val weather1 = WeatherData1(
        25.0,
        16.0,
        true,
    )

    val weather2 = WeatherData1(
        30.0,
        18.0,
        false,
    )

    println("Данные о погоде на первый день:")
    weather1.displayWeather()
    println("\nДанные о погоде на второй день:")
    weather2.displayWeather()
}