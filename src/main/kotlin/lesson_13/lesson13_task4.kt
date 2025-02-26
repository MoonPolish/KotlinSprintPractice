package org.example.lesson_13

class PhoneDirectory3(
    val name: String,
    val phoneNumber: Long?,
    val company: String?,
) {
    companion object {
        fun showContacts(phoneBook: List<PhoneDirectory3>) {
            if (phoneBook.isEmpty()) {
                println("Телефонная книга пуста.")
                return
            }

            println("Все контакты:")
            phoneBook.forEachIndexed { index, phoneDirectory3 ->
                println("${index + 1}. Имя: ${phoneDirectory3.name}")
                println("   Телефон: ${phoneDirectory3.phoneNumber}")
                println("   Компания: ${phoneDirectory3?.company}")
            }
        }
    }

}

fun addContact(phoneBook: MutableList<PhoneDirectory3>) {
    println("Введите имя: ")
    val name = readln()?.takeIf { it.isNotEmpty() } ?: run {
        println("Имя не может быть пустым.")
        return
    }

    println("Введите номер телефона: ")
    val phoneNumberStr = readln()
    val phoneNumber = phoneNumberStr.toLongOrNull()

    if (phoneNumber == null) {
        println("Неправильный формат ввода номера телефона.")
        return
    }

    print("Введите название компании (если имеется): ")
    val company = readln()?.takeIf { it.isNotEmpty() }

    val newPhoneDirectory = PhoneDirectory3(name, phoneNumber, company)
    phoneBook.add(newPhoneDirectory)
    println("Контакт успешно добавлен!")
}

fun main() {
    val phoneBook = mutableListOf<PhoneDirectory3>()

    while (true) {
        println("\nМеню:")
        println("1. Добавить контакт")
        println("2. Показать все контакты")
        println("3. Выход")

        println("Введите команду: ")
        when (readln()?.toInt()) {
            1 -> addContact(phoneBook)
            2 -> PhoneDirectory3.showContacts(phoneBook)
            3 -> break
            else -> println("Некорректная команда. Попробуйте снова.")
        }
    }
}

