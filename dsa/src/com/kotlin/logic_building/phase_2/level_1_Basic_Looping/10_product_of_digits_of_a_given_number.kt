package com.kotlin.logic_building.phase_2.level_1_Basic_Looping

fun main(){
productOfDigits(1234)
}
fun productOfDigits(n:Int){
    var num = n
    var product = 1

    if (num == 0) product = 0

    while (num != 0) {
        val digit = num % 10  // Gets the last digit (e.g., 4)
        product *= digit      // Multiplies it to our total
        num /= 10             // Removes the last digit (e.g., 1234 becomes 123)
    }
    println("Product of digits: $product")
}