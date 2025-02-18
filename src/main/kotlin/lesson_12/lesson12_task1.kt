package org.example.lesson_12

class WeatherData {
    var dayTemperature: Double = 0.0
    var nightTemperature: Double = 0.0
    var hasPrecipitation: Boolean = false

    fun diasplayWeather() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Наличие осадков: ${if (hasPrecipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val weather1 = WeatherData()
    weather1.dayTemperature = 25.0
    weather1.nightTemperature = 16.0
    weather1.hasPrecipitation = true

    val weather2 = WeatherData()
    weather2.dayTemperature = 30.0
    weather2.nightTemperature = 18.0
    weather2.hasPrecipitation = false

    println("Данные о погоде на первый день:")
    weather1.diasplayWeather()
    println("\nДанные о погоде на второй день:")
    weather2.diasplayWeather()
}