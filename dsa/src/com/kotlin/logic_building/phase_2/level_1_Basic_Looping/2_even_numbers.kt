package com.kotlin.logic_building.phase_2.level_1_Basic_Looping

fun main(){
    printEvenNumbers(10)
    println("--- Even Step ---")
    printEvenNumbersSteps(10)
}

fun printEvenNumbers(num : Int){
    for(n in 1..num){
        if(n % 2 == 0){
            println(n)
        }
    }
}

fun printEvenNumbersSteps(num : Int){
    for(n in 2..num step 2){
            println(n)
    }
}