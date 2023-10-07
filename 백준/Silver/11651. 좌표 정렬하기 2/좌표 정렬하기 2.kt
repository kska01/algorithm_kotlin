fun main() {
    val list = List(readln().toInt()) { readln().split(" ").map { it.toInt() } }
        .sortedWith(compareBy({it.last()}, {it.first()}))

    println(list.joinToString("\n") { it.joinToString(" ") })
}