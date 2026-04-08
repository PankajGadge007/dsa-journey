package com.kotlin.logic_building.phase_1.level_5_creative_or_tricky_logical_scenarios

fun main(){
isAP(2,7,12)
isAP(2,8,12)
}

//Ap is (b - a = c - b).
fun isAP(a: Int, b: Int, c: Int) {
    if (b - a == c - b) println("In AP") else println("Not in AP")
}