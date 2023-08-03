fun main() {
    val list = MutableList(30) {0}

    for (i in 1..30) {
        list[i - 1] = i
    }

    repeat(28) {
        val input = readln().toInt()
        if (list.contains(input)) {
            list.remove(input)
        }
    }

    println(list.min())
    println(list.max())
}