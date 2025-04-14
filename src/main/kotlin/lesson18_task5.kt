package org.example

class Screen {

    fun drawCircle(x: Int, y: Int): String {
        return "Нарисован круг в координатах (Int): ($x, $y)"
    }

    fun drawCircle(x: Float, y: Float): String {
        return "Нарисован круг в координатах (Float): ($x, $y)"
    }

    fun drawSquare(x: Int, y: Int): String {
        return "Нарисован квадрат в координатах (Int): ($x, $y)"
    }

    fun drawSquare(x: Float, y: Float): String {
        return "Нарисован квадрат в координатах (Int): ($x, $y)"
    }

    fun drawPoint(x: Int, y: Int): String {
        return "Нарисована точка в координатах (Int): ($x, $y)"
    }

    fun drawPoint(x: Float, y: Float): String {
        return "Нарисована точка в координатах (Int): ($x, $y)"
    }
}

fun main() {
    val screen = Screen()

    println(screen.drawCircle(1, 9))
    println(screen.drawCircle(1.0f, 9.9f))
    println()
    println(screen.drawSquare(2, 8))
    println(screen.drawSquare(2.8f, 8.6f))
    println()
    println(screen.drawPoint(5, 3))
    println(screen.drawPoint(5.6f, 3.14f))
}
