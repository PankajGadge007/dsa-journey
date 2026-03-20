package com.kotlin.logic_building.phase_1.level_4_logical_operators_and_compound_statements

fun main() {
    val units1 = 85
    val units2 = 130
    val units3 = 269
    calculateElectricityBill(units1)
    calculateElectricityBill(units2)
    calculateElectricityBill(units3)
}

fun calculateElectricityBill(units: Int) {
    var bill: Double = 0.0
    when {
        units <= 100 -> bill = units * 0.5
        units <= 200 -> bill = 100 * 0.5 + (units - 100) * 0.75
        units <= 300 -> bill = 100 * 0.5 + 100 * 0.75 +  (units - 200) * 1
    }
    println("Electricity bill $bill")
}
