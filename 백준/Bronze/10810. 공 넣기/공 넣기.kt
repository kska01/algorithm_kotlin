fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    val arr = IntArray(a)

    repeat(b) {
        val (i, j, k) = readln().split(" ").map { it.toInt() }
        for (n in i - 1..j -1) {
            arr[n] = k
        }
    }

    println(arr.joinToString(" "))
}