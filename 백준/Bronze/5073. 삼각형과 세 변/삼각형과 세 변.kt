fun main() {
    val result = mutableListOf("")

    while (true) {
        val a = readln().split(" ").map { it.toInt() }.sortedDescending().toList()

        if (a[0] == 0 && a[1] == 0 && a[2] == 0) break

        result += if (a[0] < a[1] + a[2]) {
            when {
                a[0] == a[1] && a[0] == a[2] -> "Equilateral"
                a[0] != a[1] && a[0] != a[2] && a[1] != a[2] -> "Scalene"
                else -> "Isosceles"
            }
        } else "Invalid"
    }
    result.removeAt(0)
    result.forEach { println(it) }
}