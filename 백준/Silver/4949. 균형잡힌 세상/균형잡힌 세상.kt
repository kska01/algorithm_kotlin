import java.util.*

fun main() {
    val bw = System.out.bufferedWriter()

    while (true) {
        val str = readln()
        if (str == ".") break

        val stack = Stack<Char>()
        var flag = true

        for (v in str) {
            if (v == '(') {
                stack.push(')')
            }
            if (v == ')') {
                if (stack.isEmpty() || stack.peek() != ')') {
                    flag = false
                    break
                }
                stack.pop()
            }

            if (v == '[') {
                stack.push(']')
            }
            if (v == ']') {
                if (stack.isEmpty() || stack.peek() != ']') {
                    flag = false
                    break
                }
                stack.pop()
            }
        }

        if (flag && stack.isEmpty()) {
            bw.write("yes\n")
        } else {
            bw.write("no\n")
        }
    }

    bw.flush()
    bw.close()
}