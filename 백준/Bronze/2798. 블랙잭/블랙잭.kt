fun main() {
    val (n, max) = readln().split(" ").map { it.toInt() }
    val list = readln().split(" ").map { it.toInt() }.toList()
    var result = 0

    for (i in 0..n - 3) {
        for (j in i + 1..n - 2) {
            for (k in j + 1 until n) {
                val tmp = list[i] + list[j] + list[k]
                if (tmp in (result + 1)..max) result = tmp
            }
        }
    }

    println(result)
}