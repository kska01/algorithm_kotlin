fun main() = with(System.`in`.bufferedReader()) {
    with(System.out.bufferedWriter()) {
        val n = readLine().toInt()
        for((i, v) in (n downTo 1).withIndex()) {
            repeat(v-1) {
                write(" ")
            }
            repeat(i+1) {
                write("*")
            }
            newLine()
        }
        flush()
        close()
    }
}