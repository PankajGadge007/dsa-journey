package com.kotlin.logic_building.phase_1.level_5_creative_or_tricky_logical_scenarios

fun main(){
    getCentury(1992)
    getCentury(1999)
    getCentury(2023)
    getCentury(2123)
    getCentury(2300)
}
fun getCentury(year: Int) {
    val century = if (year % 100 == 0) year / 100 else (year / 100) + 1

    val suffix = when {
        century % 10 == 1 && century % 100 != 11 -> "st"
        century % 10 == 2 && century % 100 != 12 -> "nd"
        century % 10 == 3 && century % 100 != 13 -> "rd"
        else -> "th"
    }
    println("$century$suffix century")
}