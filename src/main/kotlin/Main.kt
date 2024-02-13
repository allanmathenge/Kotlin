// Classes and objects in kotlin
// Constructors in kotlin
// Kotlin - Getters and Setters
// Inheritance in Kotlin
// Kotlin Visibility modifiers

class Lamp {

    // <--Property (data member)-->
    private var isOn: Boolean = false

    // <--!Member function!-->
    fun turnOn() {
        isOn = true
    }

    // <--!Member function!-->
    fun turnOff() {
        isOn = false
    }

    fun displayLightStatus(lamp: String) {
        if (isOn)
            println("$lamp lamp is on.")
        else
            println("$lamp lamp is off.")
    }
}

fun main(args: Array<String>) {
    val L1 = Lamp() // <--!Create L1 object of Lamp class!-->
    val L2 = Lamp() // <--!Create L1 object of Lamp class-->

    L1.turnOn()
    L2.turnOff()

    L1.displayLightStatus("L1")
    L2.displayLightStatus("L2")
}