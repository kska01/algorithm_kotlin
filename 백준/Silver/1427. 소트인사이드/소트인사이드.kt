fun main() {
    val n = readln().toList()
    val descending = n.sortedDescending()
    descending.forEach { print(it) }
}