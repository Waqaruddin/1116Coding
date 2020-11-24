
fun main(){

    removeChar("Hello", 'l')

}

fun removeChar(str:String, c:Char){

    val str2 = str.replace(c.toString(), "")
    println(str2)
}