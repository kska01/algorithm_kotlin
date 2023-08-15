import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val list = MutableList(9) { MutableList(9) { 0 } }
    var max = 0
    var row = 1
    var col = 1

    for (i in 0..8) {
        for (j in 0..8) {
            list[i][j] = sc.nextInt()
            if (list[i][j] > max) {
                max = list[i][j]
                row = i + 1
                col = j + 1
            }
        }
    }

    println(max)
    println("$row $col")
}