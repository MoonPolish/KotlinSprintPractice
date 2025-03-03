package org.example.lesson_14

abstract class Figure(val color: String) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun area() = Math.PI * radius * radius
    override fun perimeter() = 2 * Math.PI * radius
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {
    override fun area() = width * height
    override fun perimeter() = 2 * (width + height)
}

fun main() {
    val figures = listOf(
        Circle("black", 5.0),
        Rectangle("black", 4.0, 9.0),
        Circle("white", 9.0),
        Rectangle("white", 9.0, 7.0)
    )
    val blackPerimeterSum = figures.filter { it.color == "black" }.sumOf { it.perimeter() }
    val whiteAreaSum = figures.filter { it.color == "white" }.sumOf { it.area() }

    println("Сумма периметров всех чёрных фигур: $blackPerimeterSum")
    println("Сумма площадей всех белых фигур: $whiteAreaSum")
}