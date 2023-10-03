import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = System.out.bufferedWriter()
    val sb = StringBuilder()

    val n = br.readLine().toInt()
    val list = ArrayList<Int>()

    for (i in 0 until n) {
        list.add(br.readLine().toInt())
    }

    Collections.sort(list)

    for (i in list) {
        sb.append(i).append("\n")
    }

    bw.write(sb.toString())
    bw.close()
    br.close()
}