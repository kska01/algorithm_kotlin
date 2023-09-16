fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    if (a + b + c == 180) {
        println(
            when {
                a == b && a == c -> "Equilateral"
                a != b && a != c && b != c -> "Scalene"
                else -> "Isosceles"
            }
        )
    } else println("Error")
}