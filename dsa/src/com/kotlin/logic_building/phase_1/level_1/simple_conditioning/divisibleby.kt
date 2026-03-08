package com.kotlin.logic_building.phase_1.level_1.simple_conditioning

fun main() {
    val div = 5
    divisibleBy(15, div)
    divisibleBy(19, div)
    divisibleBy(355, div)
    divisibleBy(-50, div)
    divisibleBy(-22, div)
}

fun divisibleBy(i: Int, div: Int) {
    if (i % div == 0) {
        println("$i is divisible by $div")
    } else {
        println("$i is not divisible by $div")
    }
}