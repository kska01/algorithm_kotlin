import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val times = nextInt()
    val x = MutableList(times) {0}
    val y = MutableList(times) {0}

    repeat(times) {
        x[it] = nextInt()
        y[it] = nextInt()
    }

    println((x.max() - x.min()) * (y.max() - y.min()))
}