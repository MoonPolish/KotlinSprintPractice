package org.example.lesson_2

fun main() {

    val specialists = 80
    val interns = 30

    val salaryOfOneSpecialist = 30_000
    val salaryOfOneIntern = 20_000

    val expensesForSpecialists = specialists * salaryOfOneSpecialist
    val expensesForInterns = interns * salaryOfOneIntern

    val expensesForAllEmployees = expensesForSpecialists + expensesForInterns

    val mean = expensesForAllEmployees / (specialists + interns)

    println(expensesForSpecialists)
    println(expensesForAllEmployees)
    println(mean)

}