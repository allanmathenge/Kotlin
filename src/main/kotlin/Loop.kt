fun main(args: Array<String>){
// Program to compute sum of Natural Numbers from 1 - 100

    var sum: Int = 0
    var i: Int = 10

    while (i != 0){
        sum += i // sum = sum + i
        println("Sum = $sum")
        --i
    }
}