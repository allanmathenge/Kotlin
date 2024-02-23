
// Kotlin's array get() function
fun main(args: Array<String>){
    val array1 = arrayOf(1,2,3,4)
    val array2 = arrayOf<Long>(11, 12, 13, 11)

    for(e in array1){
        print("$e ")
    }

    println()

    array1.set(0, 0)
    array1[1] = 10
    for (e in array1){
        print("$e ")
    }

    println()

    for(e in array2){
        print("$e ")
    }

    println()

    array2.set(1, 10)
    array2[3] = 25
    for(e in array2){
        print("$e ")
    }
}