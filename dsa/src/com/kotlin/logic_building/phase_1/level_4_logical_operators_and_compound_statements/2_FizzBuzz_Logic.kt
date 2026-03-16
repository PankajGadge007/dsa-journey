package com.kotlin.logic_building.phase_1.level_4_logical_operators_and_compound_statements

fun main() {
    val num = 15
    fizzBuzz(num)
    val num2 = 5
    fizzBuzz(num2)
    val num3 = 3
    fizzBuzz(num3)
    val num4 = 7
    fizzBuzz(num4)
}

fun fizzBuzz(n: Int) {
    when {
        n % 3 == 0 -> println("Fizz")
        n % 5 == 0 -> println("Buzz")
        n % 3 == 0 && n % 5 == 0 -> println("FizzBuzz")
        else -> println("$n")
    }
}