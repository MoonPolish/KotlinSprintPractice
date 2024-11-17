package org.example.lesson_2

const val BABYLONIAN_NUMBER = 60
const val TIME_FORMAT = 24

fun main() {


    val departureHours = 9
    val departureMinutes = 39
    val departureTimeInMinutes = departureHours * BABYLONIAN_NUMBER + departureMinutes

    val travelTimeInMinutes = 457

    val arrivalTimeInMinutes = departureTimeInMinutes + travelTimeInMinutes
    val arrivalMinutes = arrivalTimeInMinutes % BABYLONIAN_NUMBER
    val arrivalHours = arrivalTimeInMinutes / BABYLONIAN_NUMBER % TIME_FORMAT

    val finalArrivalTime = String.format("%02d:%02d", arrivalHours, arrivalMinutes)

    println("Время прибытия поезда: $finalArrivalTime")

}