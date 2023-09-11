fun main() {
    var n = readln().toInt()

    for (i in 2..n) {
        while (n % i == 0) {
            println(i)
            n /= i
        }
        if (n < i) break
    }
}