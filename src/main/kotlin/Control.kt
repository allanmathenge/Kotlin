fun main(){

    val number: Int = 1
    var val1: Int = 0

    if (number == 0 ){
        val1 = 0
        System.out.print(val1)
    } else if(number == 2){
        val1 = 2
        System.out.print(val1)
    } else {
        val val1 = -1
        System.out.print(val1)
    }

    println()
    println("!--<>--!")

    when (number){
        0 -> println("0")
        1 -> println("1")
        else -> println("-1")
    }

    // While Loo
}

