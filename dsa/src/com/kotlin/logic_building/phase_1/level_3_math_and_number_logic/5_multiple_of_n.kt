package com.kotlin.logic_building.phase_1.level_3_math_and_number_logic

fun main(){
    val arr = arrayOf(17, 87, 14, 75, 35, 70)
    for (i in arr){
        checkSevenLogic(i)
    }
}
fun checkSevenLogic(n: Int) {
    if (n % 7 == 0 || Math.abs(n % 10) == 7) {
        println("$n matches the criteria.")
    } else {
        println("$n does not match.")
    }
}