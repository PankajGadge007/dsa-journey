package week1

import findMax
import reverseArray

fun main() {
    val input = intArrayOf(1, 2, 3, 4, 5)
    println(reverseArray(input).joinToString())
    println("Max: " + findMax(input))
}
