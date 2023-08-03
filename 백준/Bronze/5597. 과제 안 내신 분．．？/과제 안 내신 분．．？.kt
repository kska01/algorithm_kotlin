fun main() {
    val list = MutableList(30) {false}

    repeat(28) {
        val input = readln().toInt()
        list[input - 1] = true
    }

    list.forEachIndexed { index, value ->
        if (!value) println(index + 1)
    }
}