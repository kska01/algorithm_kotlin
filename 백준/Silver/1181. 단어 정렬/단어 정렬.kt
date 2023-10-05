import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val list = List(br.readLine().toInt()) { br.readLine() }.toSet().sortedWith(compareBy({it.length}, {it}))
    println(list.joinToString("\n"))
}