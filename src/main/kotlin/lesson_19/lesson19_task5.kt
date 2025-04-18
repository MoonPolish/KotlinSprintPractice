package org.example.lesson_19

import java.util.Scanner

enum class Gender {
    MALE,
    FEMALE,
    OTHER;
}

class Person(
    val name: String,
    val gender: String,
)

fun main() {
    val people = mutableListOf<Person>()

    println("Привет! Это приложение 'Картотека'.")
    println("Введите данные в следующем формате:")
    println("Имя,пол\nНапример:\nИван,MALE\nАнна,FEMALE\nОлег,OTHER")
    println("\nДоступные варианты пола: MALE, FEMALE, OTHER.")
    println("Для завершения введите 5 записей.\n")

    val scanner = Scanner(System.`in`)

    while (people.size < 5) {
        print("Введите имя и пол. Осталось ${5 - people.size} записей:\n")

        try {
            val input = scanner.nextLine()

            if (!input.contains(',')) throw IllegalArgumentException("Некорректный формат ввода. Попробуйте снова.")

            val parts = input.split(',')
            val name = parts[0].trim()
            val genderStr = parts[1].trim().uppercase()

            val gender = Gender.valueOf(genderStr)

            people.add(Person(name, gender.toString()))
        } catch (e: Exception) {
            println("Ошибка: ${e.message}. Повторите попытку.")
        }
    }

    println("\nСписок картотеки:")
    for ((index, person) in people.withIndex()) {
        println("${index + 1}. Имя: ${person.name}. Пол: ${person.gender}")
    }
}