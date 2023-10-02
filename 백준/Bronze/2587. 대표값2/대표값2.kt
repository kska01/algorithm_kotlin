fun main() {
    var total = 0
    val list = MutableList(5) { 0 }

    repeat(5) {
        val input = readln().toInt()
        total += input
        list[it] = input
    }
    
    list.sort()
    println("${total / 5}\n${list[2]}")
}