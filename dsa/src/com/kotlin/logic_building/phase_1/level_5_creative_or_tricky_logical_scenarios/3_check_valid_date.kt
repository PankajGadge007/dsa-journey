package com.kotlin.logic_building.phase_1.level_5_creative_or_tricky_logical_scenarios

fun main(){
    isValidDate(22,13)
    isValidDate(7,5)
    isValidDate(31,4)
    isValidDate(30,4)
}
fun isValidDate(day: Int, month: Int) {
    val daysInMonth = intArrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    if (month in 1..12 && day >= 1 && day <= daysInMonth[month]) {
        println("Valid Date")
    } else println("Invalid Date")
}