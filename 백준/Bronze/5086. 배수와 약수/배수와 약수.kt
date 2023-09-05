import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var a = nextInt()
    var b = nextInt()
    val result = mutableListOf("")

    while (a != 0 && b != 0) {
        result += when {
                b / a != 0 && b % a == 0 -> "factor"
                a / b != 0 && a % b == 0 -> "multiple"
                else -> "neither"
            }

        a = nextInt()
        b = nextInt()
        if (a == 0 && b == 0) break
    }

    result.removeAt(0)
    result.forEach { println(it) }
}