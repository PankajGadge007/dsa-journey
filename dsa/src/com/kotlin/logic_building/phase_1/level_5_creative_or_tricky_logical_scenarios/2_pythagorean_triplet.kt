package com.kotlin.logic_building.phase_1.level_5_creative_or_tricky_logical_scenarios

fun main(){
    isPythagoreanTriplet(2,3,7)
    isPythagoreanTriplet(3,4,5)
    isPythagoreanTriplet(3,5,4)
    isPythagoreanTriplet(15,8,17)
    isPythagoreanTriplet(12,30,15)
}

fun isPythagoreanTriplet(a: Int, b: Int, c: Int) {
    //$a^2 + b^2 = c^2$
//    val sides = listOf(a, b, c).sorted()
//    val (x, y, z) = sides
//    if (x * x + y * y == z * z) {
    if (a * a + b * b == c * c) {
        println("$a, $b, $c form a Pythagorean triplet.")
    } else {
        println("Not a triplet.")
    }
}