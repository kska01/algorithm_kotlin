import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()
    val c = nextInt()
    val d = nextInt()
    val e = nextInt()
    val f = nextInt()

    for (i in -999..999) {
        for (j in -999..999) {
            if ((a * i) + (b * j) == c && (d * i) + (e * j) == f) {
                println("$i $j")
                return@with
            }
        }
    }
}