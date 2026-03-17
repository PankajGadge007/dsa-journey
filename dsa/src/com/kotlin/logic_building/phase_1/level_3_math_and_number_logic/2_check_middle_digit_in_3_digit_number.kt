package com.kotlin.logic_building.phase_1.level_3_math_and_number_logic

fun main() {
    val arr = arrayOf(345, 102, 194, 214, 955)
    for (i in arr) {
        checkMiddleDistinct(i)
    }
}

fun checkMiddleDistinct(num: Int) {
    val first = num / 100
    val mid = (num / 10) % 10
    val last = num % 10
    when {
        mid > first && mid > last -> println("Middle is Largest.")
        mid < first && mid < last -> println("Middle is Smallest.")
        else -> println("Neither")
    }
}