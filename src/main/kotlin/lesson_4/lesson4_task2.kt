package org.example.lesson_4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_SIZE = 100

fun main() {

    val weight1 = 20
    val size1 = 80

    val weight2 = 50
    val size2 = 100

    println("Груз с весом $weight1 кг и объемом $size1 л " +
            "соответствует категории 'Average': " +
            "${(weight1 > MIN_WEIGHT)
            && (weight1 <= MAX_WEIGHT)
            && (size1 < MAX_SIZE)}")
    println("Груз с весом $weight1 кг и объемом $size1 л " +
            "соответствует категории 'Average': " +
            "${(weight2 > MIN_WEIGHT) 
            && (weight2 <= MAX_WEIGHT) 
            && (size2 < MAX_SIZE)}")

}