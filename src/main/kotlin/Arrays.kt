
// ARRAYS IN KOTLIN

//var arr = arrayOf("one", "two", "three")

// Kotlin's declaration- using arrayOf() function

// Kotlin array set() function example

fun main(args: Array<String>){
    var myArray = arrayOf(1, 2, 6, 9, 7, 5)

    for (element in myArray){
        print("$element ")
    }

    myArray.set(1, 1)
    myArray[4] = 90

    println()

    print("New values of the array: ")

    for (e in myArray){
        print("$e ")
    }

    println()

    println("The value at index 3 is " + myArray.get(3))
}