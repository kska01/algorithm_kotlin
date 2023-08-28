fun main() {
    val word = MutableList(5) { "" }
    var max = 0

    repeat(5) {
        word[it] = readln()
    }

    word.forEach { if (it.length > max) max = it.length }

    for (i in 0 until max) {
        for (j in 0..4) {
            if (word[j].getOrNull(i) != null) print(word[j][i]) else continue
        }
    }
}