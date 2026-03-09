package com.kotlin.logic_building.phase_1.level_2_nested_if_and_multiple_conditions


fun main() {
    val tr1 = listOf(5.0, 5.0, 8.0) // Example sides
    val tr2 = listOf(4.0, 5.0, 9.0) // Example sides
    val tr3 = listOf(7.0, 7.0, 7.0) // Example sides

    checkTriangleType(tr1)
    checkTriangleType(tr2)
    checkTriangleType(tr3)
}

private fun checkTriangleType(tr1: List<Double>) {
    val a = tr1.get(0)
    val b = tr1.get(1)
    val c = tr1.get(2)
//    if (a + b > c && a + c > b && b + c > a) {
    val type = when {
        a == b && b == c -> "Equilateral"
        a == b || b == c || a == c -> "Isosceles"
        else -> "Scalene"
    }
    println("Valid $type triangle.")
//    } else {
//        println("Not a valid triangle.")
//    }
}