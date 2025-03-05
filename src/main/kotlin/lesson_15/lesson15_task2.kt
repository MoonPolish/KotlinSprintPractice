package org.example.lesson_15

abstract class WeatherStationStats(val value: Double)

class Temperature(value: Double) : WeatherStationStats(value)

class PrecipitationAmount(value: Double) : WeatherStationStats(value)

class WeatherServer {
    fun sendMessage(weatherData: WeatherStationStats) {
        when (weatherData) {
            is Temperature -> println("Температура: ${weatherData.value}°C.")
            is PrecipitationAmount -> println("Количество осадков: ${weatherData.value} мм.")
        }
    }
}

fun main() {

    val temperature = Temperature(26.0)
    val precipitation = PrecipitationAmount(9.0)

    val server = WeatherServer()
    server.sendMessage(temperature)
    server.sendMessage(precipitation)

}