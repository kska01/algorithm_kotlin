import kotlin.math.pow

fun main() {
    val (num, system) = readln().split(" ")
    val value = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var result = 0
    var place = 0

    for (i in num.length - 1 downTo 0) {
        val idx = value.indexOf(num[i])
        result += (idx * system.toDouble().pow(place)).toInt()
        place++
    }

    println(result)
}