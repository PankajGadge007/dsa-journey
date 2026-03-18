package com.kotlin.logic_building.phase_1.level_4_logical_operators_and_compound_statements

fun main() {
    val num = 7
    val num2 = 14
    digitInWord(num)
    digitInWord(num2)
}

fun digitInWord(num: Int) {
    val words = arrayOf("Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine")
    if (num in 1..9) {
        println(words[num])
    } else {
        println("not a single digit.")
    }
}