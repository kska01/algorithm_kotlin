fun main() {
    val input = readln().toInt()
    var star = 1
    var blank = input - 1

    repeat(input) {
        repeat(blank--) {
            print(" ")
        }
        repeat(star) {
            print("*")
        }
        println()
        star += 2
    }

    blank = 1
    star -= 4
    repeat(input - 1) {
        repeat(blank++) {
            print(" ")
        }
        repeat(star) {
            print("*")
        }
        println()
        star -= 2
    }
}