package com.kotlin.logic_building.phase_1.level_5_creative_or_tricky_logical_scenarios

fun main (){
    isGP(3,4,5)
    isGP(4,6,9)
}

//In a GP, the ratio between consecutive terms is constant b/a = c/b.
// To avoid division by zero or precision issues, use cross-multiplication: b^2 = a * c.
fun isGP(a: Int, b: Int, c: Int) {
    if (a != 0 && b * b == a * c) println("In GP") else println("Not in GP")
}