fun main() {
    val graph = Array(100) { Array(100) { false } }
    val times = readln().toInt()

    repeat(times) {
        val (row, col) = readln().split(" ").map { it.toInt() }

        repeat(10) { x ->
            repeat(10) { y ->
                graph[row + x][col + y] = true
            }
        }
    }

    println( graph.sumOf { it.count { it } } )
}