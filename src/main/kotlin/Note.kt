open class Person(age: Int, name: String){

    init {
        println("Hello $name, I am turning $age this year")
    }
}

class Footballer1(age: Int, name: String, club: String): Person(age, name){
    // The parameters are initialized using the parameters of the base class
    init{
        println("Football player $name is $age years old and plays for $club")
    }
    fun playFootball(){
        println("I am playing football")
    }
}

fun main(args: Array<String>){
    val f1 = Footballer1(29, "Allan", "LA Galaxy")
}