fun main() {

    // Object of the class
    var obj1 = Person("Sonia", 22)
    obj1.canVote(22)
}

class Person(var name: String, var age: Int){
    fun canVote(age: Int){
        if( age < 18) {
            println("Cannot vote")
        } else {
            println("Can vote")
        }
    }
}