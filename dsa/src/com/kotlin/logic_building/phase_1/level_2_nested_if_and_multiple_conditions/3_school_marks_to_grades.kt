package com.kotlin.logic_building.phase_1.level_2_nested_if_and_multiple_conditions

fun main() {
    val myMarks = listOf<Int>(55, 61, 88, 72, 98)
    for (marks in myMarks)
        println(getGrade(marks))
}

fun getGrade(marks: Int) = when (marks) {
    in 90..100 -> "A"
    in 80..89 -> "B"
    in 70..79 -> "C"
    in 60..69 -> "D"
    else -> "F"
}