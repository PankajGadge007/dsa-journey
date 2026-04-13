package com.kotlin.logic_building.phase_2.level_1_Basic_Looping

fun main(){
sumOfEvenNumber(11)
}

fun sumOfEvenNumber(n : Int){
    var sumEven = 0
    for (i in 1..n) {
        if (i % 2 == 0) {
            sumEven += i
        }
    }
    println("Sum of even numbers up to $n: $sumEven")
}