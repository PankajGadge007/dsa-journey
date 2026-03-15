package com.kotlin.logic_building.phase_1.level_3_math_and_number_logic

fun main() {
    val (a, b) = arrayOf(90, 60)
    computeThirdAngle(a, b)
}

fun computeThirdAngle(a1: Int, a2: Int) {
    if (a1 + a2 < 180) {
        val a3 = 180 - (a1 + a2)
        println("The third angle is $a3.")
    } else {
        println("Invalid angles for a triangle.")
    }
}
