package com.kotlin.logic_building.phase_2.level_1_Basic_Looping

fun main(){
sumOfOddNumber(11)
}

fun sumOfOddNumber(n : Int){
    var sumOdd = 0
    for (i in 1..n) {
        if (i % 2 != 0) {
            sumOdd += i
        }
    }
    println("Sum of odd numbers up to $n: $sumOdd")
}