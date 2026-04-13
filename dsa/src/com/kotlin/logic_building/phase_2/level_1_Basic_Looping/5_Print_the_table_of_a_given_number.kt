package com.kotlin.logic_building.phase_2.level_1_Basic_Looping

fun main(){
    printTable(5)
}
fun printTable( n :Int) {
    for (i in 1..10) {
        println("$n * $i = ${n * i}")
    }
}