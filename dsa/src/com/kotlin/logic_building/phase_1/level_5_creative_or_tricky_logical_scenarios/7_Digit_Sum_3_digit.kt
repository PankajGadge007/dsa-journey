package com.kotlin.logic_building.phase_1.level_5_creative_or_tricky_logical_scenarios

fun main(){
    checkMiddleSum(709)
    checkMiddleSum(253)
    checkMiddleSum(697)
}

fun checkMiddleSum(num: Int) {
    val first = num / 100
    val mid = (num / 10) % 10
    val last = num % 10
    println(if (first + last == mid) "Match" else "No Match")
}