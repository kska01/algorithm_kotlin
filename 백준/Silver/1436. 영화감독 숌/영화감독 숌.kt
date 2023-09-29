fun main() {
    var n = readln().toInt()
    var num = 665
    
    while(n != 0) {
        num++
        if (num.toString().contains("666")) n--
    }
    
    println(num)
}