

fun main(){

    var arr = arrayOf(1,2,3,3)
    //println(arr.toSet())

    var str = "Hello"

    //println(str.toCharArray().toSet().joinToString(""))
}

fun onlyDigits():Boolean{
    var str = "Hello12"
    var regex = "[0-9]+"
    return  str.matches(regex.toRegex())
}