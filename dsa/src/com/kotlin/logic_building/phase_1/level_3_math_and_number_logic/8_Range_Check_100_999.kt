package com.kotlin.logic_building.phase_1.level_3_math_and_number_logic

fun main() {
    val num = 234
    isInRange(num)
    val num2 = 1234
    isInRange(num2)
}

fun isInRange(n: Int) {
    if (n in 100..999)
        println("Within range.")
    else
        println("Outside range.")
}