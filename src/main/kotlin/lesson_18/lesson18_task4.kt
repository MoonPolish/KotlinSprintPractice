package org.example.lesson_18

open class Box {
    open fun calculateTheArea(): Double {
        return 0.0
    }
}

class Rectangular(
    private val lenght: Double,
    private val width: Double,
    private val height: Double,
) : Box() {
    override fun calculateTheArea(): Double {
        return 2 * (lenght * width + lenght * height + width * height)
    }
}

class Cube(
    private val lenght: Double
) : Box() {
    override fun calculateTheArea(): Double {
        return 6 * lenght * lenght
    }
}

fun main() {
    val rectangular = Rectangular(6.8, 9.9, 10.0)
    println("Площадь прямоугольника: ${rectangular.calculateTheArea()}")

    val cube = Cube(4.8)
    println("Площадь куда: ${cube.calculateTheArea()}")
}

