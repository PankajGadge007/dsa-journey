package com.kotlin.logic_building.phase_1.level_2_nested_if_and_multiple_conditions

fun main(){
    val d = 12
    getDayName(5)
}

fun getDayName(dayNum: Int) {
    val day = when (dayNum) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day number"
    }
    println(day)
}