fun main() {
    val n = readln().toLong()
    var result = 0L

    for (i in 1..n - 2) {
        result += i * (i + 1) / 2
    }

    println("$result\n3")
}