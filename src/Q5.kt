//Print the leap year


fun main(){

    var year = 2003

    if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
        println(" $year is leap year")
    }else{
        println(" $year is  not a leap year")
    }
}