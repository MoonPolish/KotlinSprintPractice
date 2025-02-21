package org.example.lesson_13

class PhoneDirectory(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {

}

fun main() {
    val phoneDirectory1 = PhoneDirectory(
        "Пётр",
        79251236542L,
        "ООО РОГА И КОПЫТА",
    )

    val phoneDirectory2 = PhoneDirectory(
        "Владислав",
        79156541234L,

        )

    println(phoneDirectory1.company)
    println(phoneDirectory2.company)
}