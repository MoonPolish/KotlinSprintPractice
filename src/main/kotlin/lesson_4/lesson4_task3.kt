package org.example.lesson_4

const val SUNNY_WEATHER = true
const val SUNSHADE = true
const val HUMIDITY = 20
const val CURRENT_TIME_OF_YEAR = "не зима"

fun main() {

    val weatherToday = true
    val sunshade = true
    val humidity = 20
    val currentTimeOfYear = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(weatherToday == SUNNY_WEATHER) && (sunshade == SUNSHADE) && (humidity == HUMIDITY) && (currentTimeOfYear == CURRENT_TIME_OF_YEAR)}")

}