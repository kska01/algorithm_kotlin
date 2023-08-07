fun main() {
    val n = readln().toInt()
    val inputs = MutableList<String>(n) {""}

    repeat(n) {
        inputs[it] = readln()
    }

    repeat(n) {
        println("${inputs[it].first()}${inputs[it].last()}")
    }
}