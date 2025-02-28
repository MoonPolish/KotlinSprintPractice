package org.example.lesson_14.task_2

fun main() {

    val liner = Liner()
    val icebreaker = IcebreakerShip()
    val cargo = CargoShip()

    liner.displayInfo()
    liner.load()
    println()
    icebreaker.displayInfo()
    icebreaker.load()
    println()
    cargo.displayInfo()
    cargo.load()
    println()
}