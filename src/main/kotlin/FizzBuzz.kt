private const val NUM_FOR_FIZZ = 3
private const val NUM_FOR_BUZZ = 5

private const val FIZZ = "Fizz"
private const val BUZZ = "Buzz"
private const val FIZZ_BUZZ = "$FIZZ $BUZZ"

fun main(arg: Array<String>){
    for (i in 1..100){
        when{
            isBuzz(i) && isFizz(i) -> println(FIZZ_BUZZ)
            isFizz(i) -> println(FIZZ)
            isBuzz(i) -> println(BUZZ)
            else -> println(i)
        }
    }
}

private fun isFizz(i: Int): Boolean {
    return i % NUM_FOR_FIZZ == 0
}

private fun isBuzz(i: Int): Boolean {
    return i % NUM_FOR_BUZZ == 0
}