fun main() {
    val list = List(readln().toInt()) { readln().split(" ").map { it.toInt() } }
        .sortedWith(compareBy({it.first()}, {it.last()}))

    println(list.joinToString("\n") { it.joinToString(" ") })
}