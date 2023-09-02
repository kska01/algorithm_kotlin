import kotlin.math.pow

fun main() {
    val n = readln().toInt()
    val countOfSquare = 4.toDouble().pow(n).toInt()
    var a = 3
    repeat(n) {
        a += 2.0.pow(it + 1).toInt()
    }

    println(countOfSquare + a)
}