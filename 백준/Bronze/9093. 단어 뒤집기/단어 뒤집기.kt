import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedWriter(OutputStreamWriter(System.out))
    repeat(readln().toInt()) {
        val str = readln().split(" ")
        for (v in str) {
            br.write("${v.reversed()} ")
        }
        br.write("\n")
    }

    br.flush()
    br.close()
}