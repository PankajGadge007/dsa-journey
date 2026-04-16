package com.kotlin.logic_building.phase_2.level_2_number_based_looping_logic

fun main(){
palindrome(121)
palindrome(1221)
palindrome(12321)
palindrome(123421)
}
// A palindrome reads the same forward and backward (e.g., 121).
fun palindrome(original:Int){
    var n = original
    var reversed = 0
    while (n > 0) {
        reversed = reversed * 10 + (n % 10)
        n /= 10
    }
    println(if (original == reversed) "Palindrome" else "Not Palindrome")
}