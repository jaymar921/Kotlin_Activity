/*
    Created by Jayharron @JayMar on 16/2/2022
 */


class Human (name : String = ""){ // primary constructor

    private var age : Int = 21 // default age
    private var personName : String = name

    constructor(age : Int, name : String) : this(name){ // secondary constructor
        this.age = age
    }

    fun think(){
        println("$personName is thinking... he's already $age years old")
    }
}

fun main(args : Array<String>){

    val jayharron = Human("Jayharron")
    jayharron.think()

    val harold = Human(age = 10, name = "Harold")
    harold.think()


}