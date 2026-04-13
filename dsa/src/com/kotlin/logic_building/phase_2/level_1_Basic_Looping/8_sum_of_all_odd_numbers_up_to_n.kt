package com.kotlin.logic_building.phase_2.level_1_Basic_Looping

fun main(){
    sumOfOddNatural(15)
}

fun sumOfOddNatural(n:Int){
    var sum = 0
    for (i in 1..n step 2) {
        sum += i
    }
    println("Sum of odd: $sum")
}