fun main(args: Array<String>) {
    val list1 = intArrayOf(-2, 1, 7, 11, 17, 25, 48, 103)
    val list2 = intArrayOf(0, 1, 3, 5, 13, 107)
    val result = merge(list1, list2)
    println("list1 = " + list1.contentToString())
    println("list2 = " + list2.contentToString())
    println("result = " + result.contentToString())
}

private fun merge(first: IntArray, second: IntArray): IntArray {
    val result = IntArray(first.size + second.size)
    var indexResult = 0
    var indexFirst = 0
    var indexSecond = 0

    while (indexFirst < first.size && indexSecond < second.size) {
        if (first[indexFirst] <= second[indexSecond]) {
            result[indexResult++] = first[indexFirst++]
        } else {
            result[indexResult++] = second[indexSecond++]
        }
    }
    if (indexFirst == first.size) {
        System.arraycopy(second, indexSecond, result, indexResult, second.size - indexSecond)
    } else if (indexSecond == second.size) {
        System.arraycopy(first, indexFirst, result, indexResult, first.size - indexFirst)
    }
    return result
}