fun main() {
    val times = readln().toInt()
    val dividend = MutableList(times) {0}
    val quotient = MutableList(times) { MutableList(4) { 0 } }

    repeat(times) {
        dividend[it] = readln().toInt()
    }

    repeat(4) { i ->
        repeat(times) { j ->
            quotient[j][i] = when (i) {
                0 -> dividend[j] / 25
                1 -> dividend[j] / 10
                2 -> dividend[j] / 5
                else -> dividend[j] / 1
            }
            dividend[j] = when (i) {
                0 -> dividend[j] % 25
                1 -> dividend[j] % 10
                2 -> dividend[j] % 5
                else -> dividend[j] % 1
            }
        }
    }

    repeat(times) {
        println(quotient[it].joinToString(" "))
    }
}