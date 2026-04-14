package com.kotlin.logic_building.phase_2.level_2_number_based_looping_logic

fun main(){
countDigits(12345)
}

fun countDigits(num:Int){
    var n = num
    var count = 0
    if (n == 0) count = 1
    while (n > 0) {
        n /= 10
        count++
    }
    println("Number of digits: $count")
}