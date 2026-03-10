package com.kotlin.logic_building.phase_1.level_2_nested_if_and_multiple_conditions

fun main(){
    val items = listOf(12,23,46,5,-34,0)
    for (age in items)
        checkVotingEligibility(age)
}
fun checkVotingEligibility(age: Int) {
    // Minimum age 18
    if (age >= 18) {
        println("Eligible for voting")
    } else if (age >= 0) {
        println("Not eligible for voting yet")
    } else {
        println("Age cannot be negative")
    }
}