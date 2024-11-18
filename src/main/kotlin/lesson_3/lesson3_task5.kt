package org.example.lesson_3

fun main() {

    val chessMove = "D2-D4;0"
    val (where, whither, moveNumber) = chessMove.split("-", ";")

    println(where)
    println(whither)
    println(moveNumber)

}