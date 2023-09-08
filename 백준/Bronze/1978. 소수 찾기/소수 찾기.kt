import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var numOfPrimeNumber = 0
    repeat (nextInt()) {
        var numOfDivisor = 0
        val num = nextInt()

        for (i in 1..num) {
            if (num % i == 0) numOfDivisor++
        }

        if (numOfDivisor == 2) numOfPrimeNumber++
    }

    println(numOfPrimeNumber)
}