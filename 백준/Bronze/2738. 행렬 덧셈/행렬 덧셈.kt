import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val matrix = MutableList(n) { MutableList(m) {0} }

    repeat(2) {
        for (i in 0..n - 1) {
            for (j in 0..m - 1) {
                matrix[i][j] += sc.nextInt()
            }
        }
    }

    for (i in 0..n - 1) {
        for (j in 0..m - 1) {
            print("${matrix[i][j]} ")
        }
        println()
    }
}