package com.kotlin.logic_building.phase_1.level_3_math_and_number_logic

fun main() {
    // Three-digit number 100 to 999
    val arr = arrayOf(124, 224, 300, 234, 181)
    for (i in arr) {
        checkDistinct(i)
    }
}

fun checkDistinct(num: Int) {
//    a (Hundreds): num / 100
//    b (Tens): (num / 10) % 10
//    c (Units): num % 10
    val a = num / 100
    val b = (num / 10) % 10
    val c = num % 10
    if (a != b && b != c && a != c) println("All digits are distinct")
    else println("Digits are not distinct")
}