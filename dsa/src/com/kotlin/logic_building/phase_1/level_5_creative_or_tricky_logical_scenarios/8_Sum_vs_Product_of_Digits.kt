package com.kotlin.logic_building.phase_1.level_5_creative_or_tricky_logical_scenarios

fun main()
{
    compareSumProduct(12)
    compareSumProduct(11)
}

fun compareSumProduct(num: Int) {
    var temp = num
    var sum = 0
    var product = 1

    while (temp > 0) {
        val digit = temp % 10
        sum += digit
        product *= digit
        temp /= 10
    }
    println(if (sum > product) "Sum is greater" else "Product is greater or equal")
}