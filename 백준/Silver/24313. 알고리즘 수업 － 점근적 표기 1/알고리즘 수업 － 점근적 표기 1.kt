fun main() {
    val (a1, a0) = readln().split(" ").map { it.toInt() }
    val c = readln().toInt()
    val n = readln().toInt()

    if ((c - a1) * n >= a0 && c >= a1) println(1) else println(0)
}