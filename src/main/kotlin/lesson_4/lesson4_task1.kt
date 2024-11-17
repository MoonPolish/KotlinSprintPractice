package org.example.lesson_4

const val TOTAL_NUMBER_OF_TABLES = 13

fun main() {

    val tablesReservedToday = 13
    val tablesReservedTomorrow = 9

    val reservationForToday = tablesReservedToday < TOTAL_NUMBER_OF_TABLES
    val reservationForTomorrow = tablesReservedTomorrow < TOTAL_NUMBER_OF_TABLES

    println("[Доступность столиков на сегодня: $reservationForToday]\n[Доступность столиков на сегодня: $reservationForTomorrow]")

}