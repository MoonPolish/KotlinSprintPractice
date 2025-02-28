package org.example.lesson_14

fun main() {
    val liner = Liner()
    val cargo = CargoShip()
    val icebreaker = IcebreakerShip()

    println("Информация о кораблях:")
    liner.displayInfo()
    println()
    cargo.displayInfo()
    println()
    icebreaker.displayInfo()
}