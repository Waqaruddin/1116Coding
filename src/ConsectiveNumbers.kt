import java.util.*


fun main(){

    var arr = arrayOf(49, 1, 3, 200, 2, 4, 70, 5)


}


fun longestConsecutiveElementsInArray() {
    var numbers = intArrayOf(49, 1, 3, 200, 2, 4, 70, 5)
    numbers = numbers.toSortedSet().toIntArray()
    println(numbers.contentToString())
    var l = 1
    for (i in 0..numbers.size) {
        if (i < numbers.size){
            if (numbers[i + 1] == (numbers[i] + 1))
                l += 1
            else
                break
        }
    }
    println(l)
}



