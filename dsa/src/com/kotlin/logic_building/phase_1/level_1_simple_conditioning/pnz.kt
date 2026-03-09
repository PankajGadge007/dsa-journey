package com.kotlin.phase_1.level_1.simple_conditioning

fun main() {
    val p = 4
    val n = -7
    val z = 0

    printNum(p)
    printNum(n)
    printNum(z)

}

fun printNum(n: Int) {
    if (n > 0) {
        println("$n is Positive Number")
    } else if (n < 0) {
        println("$n is Negative Number")
    } else {
        println("$n is Zero")
    }
}
