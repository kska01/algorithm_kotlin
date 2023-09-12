fun main() {
    val (x, y, w, h) = readln().split(" ").map { it.toInt() }
    val a = w - x
    val b = h - y
    var min = 1000
    if (min > x) min = x
    if (min > y) min = y
    if (min > a) min = a
    if (min > b) min = b

    println(min)
}