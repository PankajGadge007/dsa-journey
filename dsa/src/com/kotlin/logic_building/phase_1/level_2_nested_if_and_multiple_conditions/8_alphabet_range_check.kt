package com.kotlin.logic_building.phase_1.level_2_nested_if_and_multiple_conditions

fun main() {
    val charcters = arrayOf('j', 'n', 'k', 'a', '$', 'p')
    for (item in charcters) {
        checkInRange(item)
    }
}

fun checkInRange(c: Char) {

    if (c in 'a'..'m') {
        println("$c in range of a to m")
    } else if (c in 'n'..'z') {
        println("$c in range of n to z")
    } else {
        println("Invalid char")
    }
}

