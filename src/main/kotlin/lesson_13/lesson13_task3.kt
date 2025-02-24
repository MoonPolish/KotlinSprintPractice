package org.example.lesson_13

class PhoneDirectory2(
    val name: String,
    val phoneNumber: Long,
    val company: List<String?> = listOf(null, null, "null", "ООО РОГА И КОПЫТА", "ООО РОМАШКА"),
)

fun main() {
    val phoneDirectory1 = PhoneDirectory2(
        "Petr",
        79251234565L
    )
    println(phoneDirectory1.company)

}