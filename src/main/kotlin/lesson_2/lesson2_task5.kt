package org.example.lesson_2

import java.util.*
import kotlin.math.pow

const val ONE_HUNDRED_PERCENT = 100

fun main() {

    val depositAmount = 70_000
    val annualPercent = 16.7
    val years = 20
    val numberOfChargesPerYear = 1

    val profit = depositAmount * (numberOfChargesPerYear + annualPercent / ONE_HUNDRED_PERCENT).pow(years)

    println(String.format(Locale.US, "%.3f", profit))

}