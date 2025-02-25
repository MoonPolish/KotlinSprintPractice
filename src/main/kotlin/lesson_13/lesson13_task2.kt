package org.example.lesson_13

class PhoneDirectory1(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null ?: "<не указано>",
) {

    fun displayInfo() {
        println("- Имя $name")
        println("- Номер: $phoneNumber")
        println("- Компания: $company")
        println()
    }

}

fun main() {

    val phoneDirectory1 = PhoneDirectory1(
        "Пётр",
        79251236542L,
        "ООО РОГА И КОПЫТА",
    )

    val phoneDirectory2 = PhoneDirectory1(
        "Владислав",
        79156541234L,

        )

    phoneDirectory1.displayInfo()
    phoneDirectory2.displayInfo()

}