fun main() {
    val n = readln()
    var result = 0

    for (i in 1..n.toInt()) {
        var tmp = i
        val stringOfNum = i.toString()

        for (j in 0..stringOfNum.length - 1) {
            tmp += stringOfNum[j].toString().toInt()
        }

        if (tmp == n.toInt()) {
            result = i
            break
        }
    }

    println(result)
}