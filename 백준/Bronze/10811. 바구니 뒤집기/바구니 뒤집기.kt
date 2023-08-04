fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val list = MutableList(n) { it + 1 }

    repeat(m) {
        var (i, j) = readln().split(" ").map { it.toInt() - 1 }
        while (i < j) {
            val tmp = list[i]
            list[i++] = list[j]
            list[j--] = tmp
        }
    }
    println(list.joinToString(" "))
}