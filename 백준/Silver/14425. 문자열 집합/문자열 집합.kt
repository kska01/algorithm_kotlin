fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val set = List(n) { readln() }.toHashSet()
    val list = List(m) { readln() }
    var count = 0

    list.forEach { if (it in set) count++ }
    println(count)
}