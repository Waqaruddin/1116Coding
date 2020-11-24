fun main() {

    var arr1 = arrayOf("hello", "world")

    var arr2 = arrayOf("world", "world")

    checkMagazine1(arr1, arr2)

}

fun checkMagazine1(magazine: Array<String>, notes: Array<String>):String {

    val mag = magazine.toMutableList()
    val ranNote = notes.toMutableList()

    for(i in ranNote){
        if(!mag.contains(i)){
            return "No"
        }else{
            mag.remove(i)
        }
    }
    return "Yes"


}



fun checkMagazine(magazine: Array<String>, note: Array<String>): String {
    val mag = magazine.toMutableList()
    val ranNote = note.toMutableList()
    for (word in ranNote) {
        if (!mag.contains(word))
            return "No"
        else
            mag.remove(word)


    }

    return "Yes"
}