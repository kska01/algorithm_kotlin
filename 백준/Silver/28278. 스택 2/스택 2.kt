import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val stack = Stack<Int>()
    val br = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readln().toInt()) {
        val input = readln().split(" ")
        when (input[0]) {
            "1" -> stack.push(input[1].toInt())
            "2" -> if (stack.isEmpty()) br.write("-1\n") else br.write("${stack.pop()}\n")
            "3" -> br.write("${stack.size}\n")
            "4" -> if (stack.isEmpty()) br.write("1\n") else br.write("0\n")
            "5" -> if (stack.isEmpty()) br.write("-1\n") else br.write("${stack.peek()}\n")
        }
    }

    br.flush()
    br.close()
}