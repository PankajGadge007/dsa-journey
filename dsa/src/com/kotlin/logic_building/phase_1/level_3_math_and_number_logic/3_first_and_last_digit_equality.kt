package com.kotlin.logic_building.phase_1.level_3_math_and_number_logic

fun main() {
    val arr = arrayOf(1242, 7227, 320, 2342, 181, 9999)
    for (i in arr) {
        checkFirstLast(i)
    }
}

fun checkFirstLast(n: Int) {
    if (n in 1000..9999) {
        val first = n / 1000
        val last = n % 10
        if (first == last) println("Equal.") else println("Not equal.")
    } else println("Not a 4-digit number.")
}