import java.util.*

fun main() {
    val stack = Stack<Int>()
    var result = 0

    repeat(readln().toInt()) {
        val num = readln().toInt()
        if (num != 0) {
            stack.push(num)
        } else {
            stack.pop()
        }
    }

    stack.map { result += it }
    println(result)
}