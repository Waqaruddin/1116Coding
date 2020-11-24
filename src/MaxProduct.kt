import java.util.*

fun main(){

    var arr = arrayOf(1,2,3,10)

    Arrays.sort(arr)

    println((arr[arr.size-1]) * (arr[arr.size-2]))
}

fun maxProduct(arr: Array<Int>):Int{
    if (arr.size<2){
        return arr[0]
    }
    arr.sorted()
    return arr[arr.size -1] * arr[arr.size-2]
}

