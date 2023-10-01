fun main() {
    val times = readln().toInt()
    val list = MutableList(times) {0}

    repeat(times) {
        list[it] = readln().toInt()
    }
    list.sort()

    repeat(times) {
        println(list[it])
    }
}