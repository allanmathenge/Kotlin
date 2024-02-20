open class Person2(age: Int, name:String){
    init {
        println("My name is $name")
        println("My age is $age")
    }
}

class MathTeacher(age: Int, name: String): Person2(age, name){
   val hisAge: Int = age

    fun teachMaths(){
        println("I teach in secondary school.. and his age is $hisAge")
    }
    init{
        println("My name is $name Mathenge") // this init block is executed after the init block of the base class
    }
}

class Footballer(age: Int, name: String): Person2(age, name){
    fun playFootball(){
        println("I play for LA Galaxy")
    }
}

fun main(args: Array<String>){
    val t1 = MathTeacher(25, "Allan")
    t1.teachMaths()

    println()

    val f1 = Footballer(29, "Christiano")
    f1.playFootball()
}
