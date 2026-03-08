package com.kotlin.logic_building.phase_1.level_1.simple_conditioning

fun main (){
    twoLargeNumber(12,54)
    twoLargeNumber(8,11)
    twoLargeNumber(77,-19)
    twoLargeNumber(-8,31)
}

fun twoLargeNumber(i: Int, j: Int) {
    if (i>j){
        println("$i is larger than $j")
    } else {
        println("$j is larger than $i")
    }
}
