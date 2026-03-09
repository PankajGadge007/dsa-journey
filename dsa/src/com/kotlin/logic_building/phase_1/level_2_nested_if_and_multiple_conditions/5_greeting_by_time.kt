package com.kotlin.logic_building.phase_1.level_2_nested_if_and_multiple_conditions

fun main() {
    val times = listOf(17,5, 13, 22)
    for (c in times)
        println(greet(c))
}

fun greet(hour: Int) = when (hour) {
    in 5..11 -> "Good Morning"
    in 12..16 -> "Good Afternoon"
    in 17..20 -> "Good Evening"
    else -> "Good Night"
}