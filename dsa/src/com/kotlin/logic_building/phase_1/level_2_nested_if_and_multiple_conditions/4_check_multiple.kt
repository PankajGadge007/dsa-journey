package com.kotlin.logic_building.phase_1.level_2_nested_if_and_multiple_conditions

fun main() {
    val (a, b) = listOf(12, 4)
    checkMultiple(a, b)

    val (a1, b1) = listOf(12, 5)
    checkMultiple(a1, b1)
}

fun checkMultiple(x: Int, y: Int) {
    if (x % y == 0 || y % x == 0) println("One is a multiple of the other")
    else println("Neither is a multiple")
}