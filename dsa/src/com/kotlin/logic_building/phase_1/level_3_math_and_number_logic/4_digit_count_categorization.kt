package com.kotlin.logic_building.phase_1.level_3_math_and_number_logic

fun main(){
    val arr = arrayOf(12,42, 227, 0, 2342, 81, 9999)
    for (i in arr) {
        categorizeDigits(i)
    }
}
fun categorizeDigits(n: Int) {
    val num = Math.abs(n)
    when {
        num in 0..9 -> println("Single-digit")
        num in 10..99 -> println("Double-digit")
        else -> println("Multi-digit")
    }
}