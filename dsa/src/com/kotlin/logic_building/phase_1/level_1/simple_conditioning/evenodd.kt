package com.kotlin.logic_building.phase_1.level_1.simple_conditioning

fun main() {
    evenodd(3)
    evenodd(91)
    evenodd(144)
    evenodd(-11)
    evenodd(30)
    evenodd(-44)
}

fun evenodd(n: Int) {
    if (n % 2 == 0) {
        println("$n is even")
    } else {
        println("$n is odd")
    }
}