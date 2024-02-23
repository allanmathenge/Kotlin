
// Function overloading --> same function, different parameters types or different number of params or different return type

// In most general cases, function overloading looks like this:

fun functionName(list_of_parameters1: Int): Int {
   return 0
}

fun functionName(list_of_parameters: Boolean) : Boolean{
    return false
}

fun functionName(list_of_parameters2: Float) : String{
    return ""
}

fun main(){
    println(sum(8, 9))
    println(sum(9.8, 3.3))
}

fun sum(var1:Double, var2: Double): Double{
    return var1 + var2
}

fun sum(var1 : Int, var2: Int): Int{
    return var1 + var2
}