package com.kotlin.logic_building.phase_2.level_2_number_based_looping_logic

fun main (){
    revNumber(12345)
}

fun revNumber(num:Int){
    var n = num
    var reversed = 0
    while (n != 0) {
        val digit = n % 10
        reversed = reversed * 10 + digit
        n /= 10
    }
    println("Reversed: $reversed")
}