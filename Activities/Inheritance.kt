/*
    Created by Jayharron @JayMar on 16/2/2022
 */
open class Entity(name:String = "Entity"){ //Parent Class or superclass (open keyword, you are allowing a class to be inherited)
    var name : String

    init {
        this.name = name
    }

    fun eat(){ // adding 'open' keyword before 'fun' will allow the function to be overridden
        println("$name is eating...")
    }

    infix fun bites(other : Entity){
        println("$name has bitten ${other.name}")
    }

}

/*
    class Cat (name : String) : Entity(name)
           ^        ^                ^
      subclass   constructor      inherited class
 */
class Cat (name : String) : Entity(name) { // Subclass (Cat)
    fun purr(){
        println("$name purred")
    }
}

class Dog (name: String) : Entity(name){ // Subclass (Dog)
    fun bark(){
        println("$name barked")
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
}