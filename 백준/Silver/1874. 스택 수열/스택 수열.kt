import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine().toInt()
    val stack = Stack<Int>()
    val arr = IntArray(n)
    var idx=0
    val ans=ArrayList<Char>()

    for(i in 0..n-1) {
        arr[i]=readLine().toInt()
    }

    for(i in 1..n){
        stack.push(i)
        ans.add('+')
        while(!stack.empty() && stack.peek()==arr[idx]){
            stack.pop()
            ans.add('-')
            idx++
        }
    }

    if(!stack.empty()) println("NO")
    else for(c in ans) println(c)
}