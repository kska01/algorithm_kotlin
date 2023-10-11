fun main() {
    val n = readln()
    val cardSet = readln().split(" ").toHashSet()
    val m = readln()
    val list = readln().split(" ").toList()

    list.forEach { if (it in cardSet) print("1 ") else print("0 ") }
}