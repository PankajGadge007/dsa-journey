fun reverseArray(arr: IntArray): IntArray {
    var left = 0
    var right = arr.size - 1

    while (left < right) {
        val temp = arr[left]
        arr[left] = arr[right]
        arr[right] = temp
        left++
        right--
    }
    return arr
}

fun main() {
    val input = intArrayOf(1, 2, 3, 4, 5)
    val reversed = reverseArray(input)
    println(reversed.joinToString())
}

fun findMax(arr: IntArray): Int {
    var max = arr[0]
    for (num in arr) {
        if (num > max) max = num
    }
    return max
}

fun main2() {
    val data = intArrayOf(2, 11, 6, 9)
    println("Max: " + findMax(data))
}
