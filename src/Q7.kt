//Given int[] array, return number with sum target for example {1,2,7,8,9}, target is 9, return (1,8),(2,7)

fun main(){

    var arr = intArrayOf(1,2,7,8,9)
    //targetSum(arr, 9)
}

fun targetSum(intArray: IntArray, target:Int){

    for(i in intArray.indices){
        for(j in i+1 until intArray.size){
            if(intArray[i] + intArray[j] == target){
                println("(" + intArray[i] + "," + intArray[j] + ")")

            }
        }
    }


}
//Given an array of random numbers, Push all the zeros of a given array to the end of the array. For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}


fun pushZeros(arr: IntArray){

}
//Print out the all the nodes of binary search tree in reverse sequence
//
//find 10 biggest number in the array(not sorting)
//
//Store all the possible substring of a string, you may skip some character but the sequence can not change
//Create a sample singleton class
//
//o   Given 2 strings, find the anagram of 2 strings   EX: “binary” -> “brainy”
//
//Print out the all the nodes of binary search tree in reverse sequence
//
//Characters in a string //Given a string of length N, print out:
////a. list of case-insensitive alphabetical characters contained in the string.
////b. Duplicate characters should only appear one time.
//Non-alphabetical characters can be ignored.
///Example:  “The rabbit” → t h e r a b i
//
//
//How do you find duplicates in an array if there is more than one duplicate?
//How to check if two Strings are anagrams of each other?
//How to program to print the first non repeated character from String?
//How to check if a String contains only digits?
//How to check if a String and given number  is Palindrome?
//How to remove duplicate characters from String?
//Write a program to remove a given character from String?
//give you two string, check if string 1 appears in the string 2(can change the combination of string 1)
//Print binary tree in level order
//Print out a reverse binary search tree?
//Give you a Banking Transaction Class has ID, Name, Amount, find all the different name associated to the same id?
//     Print out the all the nodes of binary search tree in reverse sequence
//  Store all the possible substring of a string, you may skip some character but the sequence can not change
//give Person class, it has name. Height, weight, write builder pattern
//Shuffle array. E.g. (1,2,3) -→(2,1,3) or (2,3,1) either way.
//Write sample code for Singleton pattern
//.       Create a class w/ a method to send 2 integer arrays, and list unique common numbers but not print more than once.
//Asked find biggest number and smallest number in an array (Java).                                                      i.      How to throw a null point exception