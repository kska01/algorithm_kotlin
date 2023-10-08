fun main() {
    val list = List(readln().toInt()) { readln().split(" ") }
        .sortedBy { it.first().toInt() }
    
    println(list.joinToString("\n") { it.joinToString(" ") })
}