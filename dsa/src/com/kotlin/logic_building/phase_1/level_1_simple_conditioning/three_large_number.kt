package com.kotlin.logic_building.phase_1.level_1_simple_conditioning

fun main() {
    threeLargeNumber(arrayOf(1,2,3))
    threeLargeNumber(arrayOf(4, 5, 3))
    threeLargeNumber(arrayOf(-7, -19, -9))
    threeLargeNumber(arrayOf(-8, 31, 2))
}

fun threeLargeNumber(array: Array<Int>) {
    var max = array.get(0)
    for (a in array){
        if (a>max){
           max = a
        }
    }
    println("Max = $max")
}
