package com.kotlin.logic_building.phase_1.level_5_creative_or_tricky_logical_scenarios

fun main(){
    whichDateFirst(12,12,22,12)
    whichDateFirst(12,12,12,11)
    whichDateFirst(12,2,2,11)
}

fun whichDateFirst(d1: Int, m1: Int, d2: Int, m2: Int) {
    when {
        m1 < m2 -> println("Date 1 is first")
        m2 < m1 -> println("Date 2 is first")
        d1 < d2 -> println("Date 1 is first")
        d2 < d1 -> println("Date 2 is first")
        else -> println("Same date")
    }
}