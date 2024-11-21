package org.example.lesson_5

fun main() {

    val lotteryNumber1 = 13
    val lotteryNumber2 = 5

    print("Добро пожаловать на лотерею!\nВведите первое число от 0 до 42: ")
    val firstNumber = readln().toInt()

    print("Отлично!\nТеперь введите второе число от 0 до 42: ")
    val secondNumber = readln().toInt()

    val resultText =
        if ((firstNumber == lotteryNumber1 || firstNumber == lotteryNumber2) &&
            (secondNumber == lotteryNumber1) || (secondNumber == lotteryNumber2)
        )
            "Поздравляем! Вы выиграли главный приз!"
        else if (firstNumber == lotteryNumber1 || secondNumber == lotteryNumber2) "Вы выиграли утешительный приз!"
        else "Неудача!"
    println(resultText)
}