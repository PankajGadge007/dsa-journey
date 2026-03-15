package com.kotlin.logic_building.phase_1.level_3_math_and_number_logic

fun main() {

    val n1 = 36
    val n2 = 44
    isPerfectSquare(n1)
    isPerfectSquare(n2)
}

fun isPerfectSquare(n: Int) {
    if (n < 0) {
        println("Not a perfect square.")
        return
    }
    var i = 0
    var found = false
    while (i * i <= n) {
        if (i * i == n) {
            found = true
            break
        }
        i++
    }
    if (found) println("$n is a perfect square ($i*$i).")
    else println("Not a perfect square.")
}