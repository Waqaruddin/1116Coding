

fun main(){


    var arr = arrayOf(10, 20 , 10, 10, 30)
    var hm = HashMap<String, Int>()

    for(i in arr){
        hm[i.toString()] = (hm.getOrDefault(i.toString(),0)) + 1
    }
    


}