package com.kotlin.logic_building.phase_1.level_4_logical_operators_and_compound_statements

fun main() {
    val (a, b) = listOf(49, 33)
    checkPositiveSum(a, b)
    val (ab, bt) = listOf(-9, 112)
    checkPositiveSum(ab, bt)
}

fun checkPositiveSum(a: Int, b: Int) {
    if (a > 0 && b > 0 && (a + b) < 100) {
        println("Both are positive and their sum is less than 100.")
    } else {
        println("Condition not met.")
    }
}