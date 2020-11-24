import java.util.*

fun main(){
    var arr = arrayOf(1,2,3,-5,-4)

    Arrays.sort(arr)
    //println(arr.contentToString())

    println(posNegInt(arr).contentToString())
}


fun posNegInt(arr: Array<Int>):Array<Int>{
    val posArray = ArrayList<Int>()
    val negArray = ArrayList<Int>()
    for ( i in arr){
        if (i<0)
            negArray.add(i)
        else
            posArray.add(i)
    }
    negArray.addAll(posArray)
    return negArray.toTypedArray()

}