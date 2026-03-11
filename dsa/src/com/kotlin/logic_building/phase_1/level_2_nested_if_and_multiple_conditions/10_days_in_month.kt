package com.kotlin.logic_building.phase_1.level_2_nested_if_and_multiple_conditions

fun main(){
    val m1 = 7
    getDaysInMonth(m1)
    val m2 = 4
    getDaysInMonth(m2)
    val m3 = 2
    getDaysInMonth(m3)
}
fun getDaysInMonth(monthNum: Int) {
    val days = when (monthNum) {
        1, 3, 5, 7, 8, 10, 12 -> 31
        4, 6, 9, 11 -> 30
        2 -> 28
        else -> 0
    }

    if (days > 0) println("Number of days: $days")
    else println("Invalid month number")
}