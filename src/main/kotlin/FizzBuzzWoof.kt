private const val NUM_FOR_FIZZ = 3
private const val NUM_FOR_BUZZ = 5
private const val NUM_FOR_WOOF = 7

private const val FIZZ = "Fizz"
private const val BUZZ = "Buzz"
private const val WOOF = "Woof"
private const val DELIMITER = " "

fun main() {
    val sb = StringBuilder()
    for (i in 1..105) {
        if (isFizz(i)) {
            sb.append(FIZZ).append(DELIMITER)
        }
        if (isBuzz(i)) {
            sb.append(BUZZ).append(DELIMITER)
        }
        if (isWoof(i)) {
            sb.append(WOOF)
        }
        if (sb.isEmpty()) {
            sb.append(i)
        }

        sb.removePrefix(DELIMITER)
        println(sb.toString())
        sb.clear()
    }
}

private fun isFizz(i: Int): Boolean {
    return i % NUM_FOR_FIZZ == 0
}

private fun isBuzz(i: Int): Boolean {
    return i % NUM_FOR_BUZZ == 0
}

private fun isWoof(i: Int): Boolean {
    return i % NUM_FOR_WOOF == 0
}