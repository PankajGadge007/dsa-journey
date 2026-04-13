package com.kotlin.logic_building.phase_2.level_1_Basic_Looping

fun main(){
    factorial(4)
}
fun factorial(n:Int){

    var factorial: Long = 1
    for (i in 1..n) {
        factorial *= i
    }
    println("Factorial of $n is $factorial")
}