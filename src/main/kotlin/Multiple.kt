
private val MULTIPLES = intArrayOf( 3, 5 )

fun main(args: Array<String>) {

    var sum = 0
    for (num in 1 until 1000){
       if ( num.isMultiple(*MULTIPLES) ){
           sum += num
       }
    }
    println("sum = $sum")
}

fun Int.isMultiple(vararg multiples: Int): Boolean{
    for (multiple in multiples){
        if (this % multiple == 0) return true
    }
    return false
}