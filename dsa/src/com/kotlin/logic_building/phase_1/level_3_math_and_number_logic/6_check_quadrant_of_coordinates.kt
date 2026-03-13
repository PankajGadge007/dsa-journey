package com.kotlin.logic_building.phase_1.level_3_math_and_number_logic

fun main() {
    val points = listOf(12 to 3, -5 to 2, 8 to -5, 0 to 0, -7 to -9)
    for ((x, y) in points) {
        findQuadrant(x, y)
    }
}

fun findQuadrant(x: Int, y: Int) {
    when {
        x > 0 && y > 0 -> println("Quadrant 1")
        x < 0 && y > 0 -> println("Quadrant 2")
        x < 0 && y < 0 -> println("Quadrant 3")
        x > 0 && y < 0 -> println("Quadrant 4")
        x == 0 && y == 0 -> println("Origin")
        else -> println("On an axis")
    }
}