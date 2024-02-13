fun main() {
    val array = intArrayOf(1, 2, 1, 2, 3, 3, 55, 33)
    array.sort()

    var sum = 0
    var eta = array[0] - 1
    array.forEach {i ->
        sum = sum.takeIf { i == eta }?.let { sum - i } ?: (sum + i)
        eta = i
    }
    println("sum = $sum")
}
