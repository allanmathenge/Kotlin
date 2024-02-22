package Loops

fun main(args: Array<String>){

    // Iterating through a range

    for (i in 1..5){
        println(">> i is $i")
    }

    println()

    // Iterating through a string

    var name: String =  "MATHENGE"
    for (i in name){
        println(i)
    }
}