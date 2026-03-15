package com.kotlin.logic_building.phase_1.level_3_math_and_number_logic

fun main (){
    val n = 978000
    checkCurrency(n)
}

fun checkCurrency(amount: Int) {
    // To be evenly divided into these specific notes,
    // the amount must be a multiple of the smallest denomination (100).
    if (amount % 100 == 0) {
        println("Can be divided into 2000, 500, or 100 notes.")
    } else {
        println("Cannot be divided evenly.")
    }
}