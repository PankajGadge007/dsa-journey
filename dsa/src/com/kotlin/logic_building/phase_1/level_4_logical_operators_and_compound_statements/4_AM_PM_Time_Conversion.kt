package com.kotlin.logic_building.phase_1.level_4_logical_operators_and_compound_statements

fun main() {
    val (hrs, min) = arrayOf(19, 57)
    checkAmPm(hrs, min)
    val (hrs2, min2) = arrayOf(9, 15)
    checkAmPm(hrs2, min2)
}

fun checkAmPm(hours: Int, minutes: Int) {
    if (hours in 0..23 && minutes in 0..59) {
        if (hours < 12) {
            println("AM")
        } else {
            println("PM")
        }
    } else {
        println("Invalid time input.")
    }
}