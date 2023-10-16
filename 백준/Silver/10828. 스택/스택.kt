import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val stack = Stack<Int>()
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readln().toInt()) {
        when (next()) {
            "push" -> {
                stack.push(nextInt())
            }

            "top" -> bw.write("${if (stack.isEmpty()) -1 else stack.peek()}\n")
            "size" -> bw.write("${stack.size}\n")
            "empty" -> bw.write("${if (stack.isEmpty()) 1 else 0}\n")
            "pop" -> bw.write("${if (stack.isEmpty()) -1 else stack.pop()}\n")
        }
    }
    bw.flush()
    bw.close()
}