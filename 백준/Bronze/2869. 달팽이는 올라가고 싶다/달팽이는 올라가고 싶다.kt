import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val day = nextInt()
    val night = nextInt()
    val goal = nextInt()
    var distance = goal - day
    val actualDistanceADay = day - night
    var times = 0

    times = distance / actualDistanceADay
    times += if (distance % actualDistanceADay == 0) 0 else 1

    println(times + 1)
}