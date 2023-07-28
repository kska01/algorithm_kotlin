fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    val arr = Array(a) { i -> i + 1 }

    repeat(b) {
        val (i, j) = readln().split(" ").map { it.toInt() }
        val temp = arr[i - 1]
        arr[i - 1] = arr[j - 1]
        arr[j - 1] = temp
    }

    println(arr.joinToString(" "))
}