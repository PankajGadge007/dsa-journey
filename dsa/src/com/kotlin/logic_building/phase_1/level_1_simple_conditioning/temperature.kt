package com.kotlin.logic_building.phase_1.level_1_simple_conditioning

fun main() {
    val temperatureList = arrayOf(-24, 4, 36, 0, -3, 18)
    for (t in temperatureList)
        printTemperature(t)
}

fun printTemperature(temp: Int) {
    when (temp) {
    in -50..15 -> println("$temp is Cold")
    in 16..32 -> println("$temp is Warm")
    in 33..50 -> println("$temp is Hot")
    }
}