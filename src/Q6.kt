//Given an array of numbers, tell me the number that occurs most frequently.[2,3,4,66,4,3]


fun main(){
    var arr = intArrayOf(1,2,2,3,3,3,4)

    var hashMap = HashMap<String,Int>()

    for (i in arr){
        hashMap[i.toString()] = (hashMap.getOrDefault(i.toString() , 0)) + 1
    }

    println(hashMap.maxBy{it.value})
}