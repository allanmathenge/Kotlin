fun main(){
    // Object of the class

    var obj1 = Me("Allan", 13)
    obj1.canVote(22)
}

class Me(var name: String, var age: Int){

    lateinit var profession: String

    fun canVote(age: Int){
        if (age < 18)
            println("Can not vote")
        else{
            println("Can Vote")
        }
    }
}