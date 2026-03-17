package com.kotlin.logic_building.phase_1.level_4_logical_operators_and_compound_statements

fun main(){
    val (a,b,c) = arrayOf(4,9,5)
    printMedian(a,b,c)
}

fun printMedian(a: Int, b: Int, c: Int) {
    val median = when {
        (a in b..c) || (a in c..b) -> a
        (b in a..c) || (b in c..a) -> b
        else -> c
    }
    println("The median value is: $median")
}