package org.example.lesson_16

class Circle(private val radius: Double) {

    companion object {
        private const val PI = 3.14
    }

    fun calculateCircumference(): Double {
        return 2 * PI * radius
    }

    fun calculateCircleArea(): Double {
        return PI * radius * radius
    }
}

fun main() {
    val circle = Circle(5.0)

    val circumference = circle.calculateCircumference()
    val area = circle.calculateCircleArea()

    println("Длина окружности: $circumference")
    println("Площадь круга: $area")
}