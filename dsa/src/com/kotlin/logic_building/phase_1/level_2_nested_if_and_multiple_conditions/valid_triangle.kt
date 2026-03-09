package com.kotlin.logic_building.phase_1.level_2_nested_if_and_multiple_conditions

fun main() {
    val (a, b, c) = listOf(5.0, 5.0, 8.0) // Example sides

    if (a + b > c && a + c > b && b + c > a) {
        println("Valid triangle.")
    } else {
        println("Not a valid triangle.")
    }
}