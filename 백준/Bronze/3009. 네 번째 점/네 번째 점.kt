fun main() {
    val (x1, y1) = readln().split(" ")
    val (x2, y2) = readln().split(" ")
    val (x3, y3) = readln().split(" ")

    print(
        when (x1) {
            x2 -> x3
            x3 -> x2
            else -> x1
        }
    )

    print(
        when (y1) {
            y2 -> " $y3"
            y3 -> " $y2"
            else -> " $y1"
        }
    )
}