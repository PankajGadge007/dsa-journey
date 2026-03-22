package com.kotlin.logic_building.phase_1.level_5_creative_or_tricky_logical_scenarios

fun main(){
    checkPointPosition(12,3)
    checkPointPosition(0,4)
    checkPointPosition(6,9)
    checkPointPosition(9,0)
}

fun checkPointPosition(x: Int, y: Int) {
    when {
        x == 0 && y == 0 -> println("The point is at the Origin.")
        x == 0 -> println("The point lies on the Y-axis.")
        y == 0 -> println("The point lies on the X-axis.")
        else -> println("The point is in a quadrant at ($x, $y).")
    }
}