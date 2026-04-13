package com.kotlin.logic_building.phase_2.level_1_Basic_Looping

fun main(){
    sumOfNaturals(5)
}
fun sumOfNaturals(n:Int){

    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    println("Sum: $sum")
}