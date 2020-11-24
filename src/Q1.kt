//Given int[] array return number appears twice

fun main() {

    var arr = arrayOf(1, 2, 3, 4, 5, 5, 4, 4)


    var hm = HashMap<String, Int>()
    var output2 = ""
    for (i in arr) {
        hm[i.toString()] = (hm.getOrDefault(i.toString(), 0)) + 1
    }

    for (i in arr) {
        if (hm[i.toString()] == 2 && !output2.contains(i.toString())) {
            output2 += i
        }
    }
    println(output2)

}