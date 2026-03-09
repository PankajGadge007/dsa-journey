package com.kotlin.logic_building.phase_1.level_1_simple_conditioning

fun main() {
    val items = listOf('a', 'B', '7', '+', '?', '2','Z')
    for (ch in items) {
        checkItems(ch)
    }
}

fun checkItems(ch: Char) {
    when {
        ch.isDigit() -> println("$ch is a digit")
        ch.isUpperCase() -> println("$ch is a uppercase letter")
        ch.isLowerCase() -> println("$ch is a lowercase letter")
        else -> println("$ch is special character")
    }
}
