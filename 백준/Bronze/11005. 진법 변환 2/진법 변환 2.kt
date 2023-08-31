fun main() {
    val (decimal, system) = readln().split(" ").map { it.toInt() }
    var quotient = decimal
    var result = ""

    while (quotient >= system) {
        val remainder = quotient % system
        if (remainder > 9) {
           result += remainder.toChar() + 55
        } else {
            result += remainder.toString()
        }
        quotient /= system
    }
    
    result += if (quotient > 9) {
        quotient.toChar() + 55
    } else quotient.toString()

    println(result.reversed())
}