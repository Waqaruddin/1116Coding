fun main() {

    var arr = arrayOf(1, 2, 3, 4, 6)
    var n = 6
    var mySum = arr.sum()
    var sum = n * (n + 1) / 2

    println("Missing number = " + (sum - mySum))

}