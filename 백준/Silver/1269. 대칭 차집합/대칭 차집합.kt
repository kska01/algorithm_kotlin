fun main() {
    val a =readln()
    val listA = readln().split(" ").map { it.toInt() }.toHashSet()
    val listB = readln().split(" ").map { it.toInt() }.toHashSet()

    println(listA.subtract(listB).union(listB.subtract(listA)).size)
}