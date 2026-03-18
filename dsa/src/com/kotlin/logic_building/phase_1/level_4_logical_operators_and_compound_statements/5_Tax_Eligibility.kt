package com.kotlin.logic_building.phase_1.level_4_logical_operators_and_compound_statements

fun main() {
    val age = 34
    val income = 900000
    checkEligibility(age, income)
    val age2 = 17
    val income2 = 200000
    checkEligibility(age2, income2)
}

fun checkEligibility(age: Int, income: Int) {
    if (age >= 18 && income > 500000) {
        println("Eligible for Tax")
    } else {
        println("Not eligible for Tax")
    }
}