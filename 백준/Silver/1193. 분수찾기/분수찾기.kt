fun main() {
    val input = readln().toInt()
    var times = 1
    var checkRange = 0

    while (checkRange < input) {
        checkRange += times++
    }

    --times
    checkRange -= (times - 1)

    if (times  % 2 == 0 ) {
        println("${1 + input - checkRange}/${times - (input - checkRange)}")
    } else {
        println("${times - (input - checkRange)}/${1 + input - checkRange}")
    }
}