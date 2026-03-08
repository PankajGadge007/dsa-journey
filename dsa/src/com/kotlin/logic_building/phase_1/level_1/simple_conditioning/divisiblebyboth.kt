package com.kotlin.logic_building.phase_1.level_1.simple_conditioning

fun main() {
    val divA = 3
    val divB = 5
    divisibleByBoth(15, divA,divB)
    divisibleByBoth(19, divA,divB)
    divisibleByBoth(355, divA,divB)
    divisibleByBoth(-50, divA,divB)
    divisibleByBoth(-30, divA,divB)
}

fun divisibleByBoth(i: Int, divA: Int, divB:Int) {
    if (i % divA == 0 && i % divB == 0 ) {
        println("$i is divisible by $divA & $divB")
    } else {
        println("$i is not divisible by $divA & $divB")
    }
}
