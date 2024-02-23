
// Function that does not return any meaningful value. `Unit` can be omitted.
fun printSum(a: Int, b: Int):Unit{
    println("Sum of $a and $b is ${a + b}")
}

fun main(){
    printSum(2, 3)
}