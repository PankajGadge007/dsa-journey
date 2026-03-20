package com.kotlin.logic_building.phase_1.level_4_logical_operators_and_compound_statements


fun main() {
    val day1 = 2
    val day2 = 6
    checkDayType(day1)
    checkDayType(day2)
}

fun checkDayType(day: Int) {
    if (day in 1..5) {
        println("It's weekday.")
    } else if (day in 6..7) {
        println("It's weekend!")
    } else {
        println("Invalid day number.")
    }
}