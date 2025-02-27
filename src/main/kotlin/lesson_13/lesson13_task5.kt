package org.example.lesson_13

class PhoneDirectory4(
    val name: String,
    val phoneNumber: String?,
    val company: String?,
)

fun addContact() {

    println("Введите номер телефона: ")

    try {
        val phoneNumberStr = readln().toLong()
    } catch (e: NumberFormatException) {
        println("Ошибка: Неправильный формат ввода номера телефона: ${e.message}. Попробуйте снова.")
        return
    }
}

fun main() {
    addContact()
}
