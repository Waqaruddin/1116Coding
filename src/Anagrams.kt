
fun main(){

    println(anagrams("abc","abc"))
}

fun anagrams(s1:String, s2:String):Boolean{

    if(s1.length != s2.length){
        return false
    }

    var x = s1.toLowerCase().toCharArray().sorted().joinToString { "" }
    var y = s2.toLowerCase().toCharArray().sorted().joinToString { "" }

    return x==y
}