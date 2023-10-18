import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readln().toInt()) {
        val stack = Stack<Char>()
        var flag = true
        val str = readln()

        for (v in str) {
            if (v == '(') {
                stack.push(')')
            } else {
                if (stack.isEmpty()) {
                    flag = false
                    break
                }
                stack.pop()
            }
        }
        if (flag && stack.isEmpty()) {
            br.write("YES\n")
        } else {
            br.write("NO\n")
        }
    }

    br.flush()
    br.close()
}