package org.example.lesson_13

class PhoneDirectory2(
    val name: String,
    val phoneNumber: Long,
    val companies: List<String?>,
)

fun displayInfo() {
    val filteredCompanies = phoneDirectory2.companies.mapNotNull { company ->
        when (company) {
            null -> null
            else -> company
        }
    }
    println(filteredCompanies)
}

val phoneDirectory2 = PhoneDirectory2(
    "Petr",
    79251234565L,
    listOf(null, null, "null", "ООО РОГА И КОПЫТА", "ООО РОМАШКА"),
)


fun main() {
    println(displayInfo())
}

