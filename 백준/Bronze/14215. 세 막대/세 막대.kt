fun main() {
    val a = readln().split(" ")
        .map { it.toInt() }.sortedDescending().toList()

    if (a[0] < a[1] + a[2]) {
        println(a[0] + a[1] + a[2])
    } else {
        println(2 * (a[1] + a[2]) - 1)
    }
}