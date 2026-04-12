package com.kotlin.logic_building.phase_2.level_1_Basic_Looping

fun main(){
    printOddNumbers(10)
    println("--- Odd using Step ---")
    printOddNumbersSteps(10)
}

fun printOddNumbers(num : Int){
    for(n in 1..num){
        if(n % 2 != 0){
            println(n)
        }
    }
}

fun printOddNumbersSteps(num : Int){
    for(n in 1..num step 2){
        println(n)
    }
}