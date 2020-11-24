import kotlin.coroutines.coroutineContext

fun main(){

    var s1 = "hello"
    var s2 = "world"



    for(i in s1){

        if(s2.contains(i)){

            s1 = s1.replace(i.toString(), "")
        }
    }
    println(s1)


}

