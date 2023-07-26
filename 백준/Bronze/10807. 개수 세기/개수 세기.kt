fun main() {
    val n = readln().toInt()
    val digits = readln().split(" ")
    val target = readln()
    var count = 0

    digits.forEach { if (it == target) count++ }

    println(count)
}