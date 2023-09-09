fun main() {
    val m = readln().toInt()
    val n = readln().toInt()
    var min = 10000
    var total = 0

    for (value in m..n) {
        var count = 0
        for (i in 1..value) {
            if (value % i == 0) count++
        }
        if (count == 2) {
            if (value < min) min = value
            total += value
        }
    }
    if (total == 0) {
        println(-1)
    } else {
        println(total)
        println(min)
    }
}