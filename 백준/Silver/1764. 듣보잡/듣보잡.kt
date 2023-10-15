fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val list1 = List(n) { readln() }.toHashSet()
    val list2 = List(m) { readln() }.toHashSet()
    val result = mutableListOf<String> ()
    var count = 0

    list1.forEach { if (it in list2) {
        count++
        result.add(it)
    } }

    result.sort()
    println(count)
    println(result.joinToString("\n"))
}