/*
    Created by Jayharron @JayMar on 16/2/2022

    See Inheritance.kt
 */
abstract class Entity(name:String = "Entity"){
    var name : String

    init {
        this.name = name
    }

    abstract fun action()

    fun eat(){
        println("$name is eating...")
    }

    infix fun bites(other : Entity){
        println("$name has bitten ${other.name}")
    }

}

class Cat (name : String) : Entity(name) { // Subclass (Cat)
    fun purr(){
        println("$name purred")
    }
    override fun action() {
        println("Walking")
    }
}

class Dog (name: String) : Entity(name){ // Subclass (Dog)
    fun bark(){
        println("$name barked")
    }
    override fun action() {
        println("Running")
    }
}

class Bird(name : String) : Entity(name){
    override fun action() {
        println("$name just landed")
    }
}



fun main(args : Array<String>){
    // in Java : `Entity sphynx = new Cat("Kitty Galore");`
    val sphynx = Cat("Kitty Galore")
    sphynx.eat()
    sphynx.purr()

    val siberianHusky = Dog("HuskPuff")
    siberianHusky.eat()
    siberianHusky.bark()

    siberianHusky bites sphynx

    val blueJay = Bird("Flappy")
    blueJay.action()
    blueJay.eat()

    siberianHusky bites blueJay
}
