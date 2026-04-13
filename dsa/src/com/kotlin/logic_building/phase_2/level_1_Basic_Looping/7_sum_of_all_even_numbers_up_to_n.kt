package com.kotlin.logic_building.phase_2.level_1_Basic_Looping

fun main(){
sumOfEvenNatural(15)
}

fun sumOfEvenNatural(n:Int){
    var sum = 0
    for (i in 2..n step 2) {
        sum += i
    }
    println("Sum of even: $sum")
}