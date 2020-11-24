import java.util.*

fun main() {

    var arr = arrayOf(0, 1, 0, 3, 5)
    var list1 = ArrayList<Int>()
    var list2 = ArrayList<Int>()

    for(i in arr){
        if(i == 0){
            list1.add(i)
        }else{
            list2.add(i)
        }
    }

    var list3 = list2 + list1
    println(list3)


}

fun pushZerosToEnd(array: Array<Int>, len: Int) {

    Arrays.sort(array)
    for (i in 0..len) {
        if (array[i] > 0) {
            break
        } else {
            val j = len - 1 - i
            val temp = array[i]
            array[i] = array[j]
            array[j] = temp
        }
    }
    println(array.contentToString())

}
