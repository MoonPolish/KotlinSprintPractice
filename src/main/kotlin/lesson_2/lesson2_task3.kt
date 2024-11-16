package org.example.lesson_2

fun main() {

    val babylonianNumber = 60
    val timeFormat = 24

    val timeDepartureString = "9:39"
    val (departureHours, departureMinutes) = timeDepartureString.split(":").map { it.toInt() }
    val departureTimeInMinutes = departureHours * babylonianNumber + departureMinutes

    val travelTimeInMinutes = 457

    val arrivalTimeInMinutes = departureTimeInMinutes + travelTimeInMinutes
    val arrivalMinutes = arrivalTimeInMinutes % babylonianNumber
    val arrivalHours = arrivalTimeInMinutes / babylonianNumber % timeFormat

    val finalArrivalTime = String.format("%02d:%02d", arrivalHours, arrivalMinutes)

    println("Время прибытия поезда: $finalArrivalTime")

}