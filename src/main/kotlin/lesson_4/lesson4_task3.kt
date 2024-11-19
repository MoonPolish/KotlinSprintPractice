package org.example.lesson_4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val HUMIDITY = 20
const val CURRENT_TIME_OF_YEAR = "зима"

fun main() {

    val weatherToday = true
    val sunshade = true
    val humidity = 20
    val currentTimeOfYear = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${(weatherToday == IS_SUNNY) && 
            (sunshade == IS_AWNING_OPEN) && 
            (humidity == HUMIDITY) && 
            (currentTimeOfYear != CURRENT_TIME_OF_YEAR)}")

}