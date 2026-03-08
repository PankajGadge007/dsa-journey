package com.kotlin.logic_building.phase_1.level_1.simple_conditioning

fun main() {
    for (i in 1880..2032) {
        isLeapYear(i)
    }
}

fun isLeapYear(year: Int) {
//    // Julian Calendar
//    if (year % 4 == 0) {
//        println("$year is leap year")
//    } else {
//        println("$year is not leap year")
//    }

    // Gregorian Calendar
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        println("$year is leap year")
    } else {
        println("$year is not leap year")
    }
}
