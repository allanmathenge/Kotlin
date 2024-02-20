// Primary contructor ==> usually in parenthesis

// PRIMARY CONSTRUCTOR AND INITIALIZER BLOCKS

fun main(args: Array<String>){
    val person1 = Person1("joe", 25)
}

class Person1(fName: String, personAge: Int){ // Primary constructors accept the values passed above

    // Below are properties of the class Person
    val firstName = fName.capitalize()
    var age = personAge

    // INITIALIZER BLOCK
    init {
        println("First name = $firstName")
        println("Age = $age")
    }
}