fun main() {
    val input = mutableListOf(0)

    while (true) {
        val num = readln().toInt()
        if (num == -1) break
        input += num
    }
    input.removeAt(0)

    for (value in input) {
        val divisors = mutableListOf(0)

        for (i in 1 until value) {
            if (value % i == 0) divisors += i
        }
        divisors.removeAt(0)

        if (divisors.sum() == value) {
            print("$value = ${divisors[0]}")
            for (i in 1..divisors.lastIndex) print(" + ${divisors[i]}")
            println()
        } else {
            println("$value is NOT perfect.")
        }
    }
}