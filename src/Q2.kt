//Find the element that appears once in an array where every other element appears twice.


fun main() {

   var arr = arrayOf(1,2,3,3)
    var hm = HashMap<String, Int>()

    for(i in arr){
        hm[i.toString()] = (hm.getOrDefault(i.toString(), 0)) + 1
    }

    for(i in arr){
        if(hm[i.toString()] == 1){
            println(i)
        }
    }

}



