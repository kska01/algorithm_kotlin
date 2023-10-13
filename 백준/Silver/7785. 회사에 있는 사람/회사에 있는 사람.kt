fun main() {
    val n = readln().toInt()
    val list = HashSet<String>()

    repeat(n) {
        val (name, status) = readln().split(" ")
        if (list.add(name)) {
            list.add(name)
        } else {
            if (status == "leave") {
                list.remove(name)
            }
        }
    }

    list.sortedDescending().forEach { println(it) }
}