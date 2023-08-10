fun main() {
    val input = readln().split(" ").map { it.toInt() }.toMutableList()
    val value = listOf(1, 1, 2, 2, 2, 8)
    val result = MutableList(6) { 0 }
    var count = 0

    repeat(6) {
        if (input[it] == value[it]) {
            result[it] = 0
        } else if (input[it] > value[it]) {
            while (input[it] != value[it]) {
                input[it]--
                count--
            }
            result[it] = count
            count = 0
        } else {
            while (input[it] != value[it]) {
                input[it]++
                count++
            }
            result[it] = count
            count = 0
        }
    }

    println(result.joinToString(" "))
}