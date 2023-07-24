fun main() {
    val total = readln().toInt()
    var result = 0
    
    for (i in 1..readln().toInt()) {
        val (a, b) = readln().split(' ').map { it.toInt() }
        result += a * b
    }
    
    println( if (total == result) "Yes" else "No" )
}