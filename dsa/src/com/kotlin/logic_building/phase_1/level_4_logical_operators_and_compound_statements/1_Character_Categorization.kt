package com.kotlin.logic_building.phase_1.level_4_logical_operators_and_compound_statements

fun main() {
    val ch1 = 'a'
    val ch2 = '1'
    checkCharType(ch1)
    checkCharType(ch2)
}

fun checkCharType(ch: Char) {
    when {
        ch.isLetter() -> println("It is a Letter.")
        ch.isDigit() -> println("It is a Digit.")
        else -> println("It is neither a letter nor a digit.")
    }
}