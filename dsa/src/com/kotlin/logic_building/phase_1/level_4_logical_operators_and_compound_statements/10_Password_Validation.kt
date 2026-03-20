package com.kotlin.logic_building.phase_1.level_4_logical_operators_and_compound_statements

fun main(){
    val pass1 ="abcd1234"
    val pass2 ="aBcdefgha"
    validatePassword(pass1)
    validatePassword(pass2)
}
fun validatePassword(password: String) {
    if (password.length >= 8 && password.any { it.isDigit() }) {
        println("Password is valid.")
    } else {
        println("Password invalid: Must be ≥ 8 chars and contain at least one digit.")
    }
}