package com.kotlin.logic_building.phase_2.level_1_Basic_Looping

fun main() {
    sumOfNatural(11)
}


fun sumOfNatural(n: Int) {
    var sumN = 0
    for (i in 1..n) {
        sumN += i
    }
    println("Sum of first $n natural numbers: $sumN")
}
