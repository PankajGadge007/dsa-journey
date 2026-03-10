package com.kotlin.logic_building.phase_1.level_2_nested_if_and_multiple_conditions

fun main() {
    val (a, b) = listOf(12, 3)
    checkPairOfNum(a, b)
    val (c, d) = listOf(20, 34)
    checkPairOfNum(c, d)
    val (e, f) = listOf(37, 89)
    checkPairOfNum(e, f)
}

fun checkPairOfNum(a: Int, b: Int) {

    if (a % 2 == 0 && b % 2 == 0) {
        println("both are even")
    } else if (a % 2 != 0 && b % 2 != 0) {
        println("both are odd")
    } else {
        println("one is even and other is odd")
    }
}