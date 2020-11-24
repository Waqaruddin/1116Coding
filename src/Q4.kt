import java.util.*

//Write the code to get the Fibonacci sequence.


fun main(){
    var num = 10
    var a = 0
    var b = 0
    var c = 1


    for (i in 0 until num) {
        a = b
        b = c
        c = a + b
        println(a.toString() + "")
    }
}