/*
    Created by Jayharron @JayMar on 16/2/2022

    Required @Person.kt
    
    Kotlin provides the ability to extend a class with new functionality without having to inherit 
    from the class or use design patterns such as Decorator. This is done via special declarations called extensions.

    For example, you can write new functions for a class from a third-party library that you can't modify. 
    Such functions can be called in the usual way, as if they were methods of the original class. This 
    mechanism is called an extension function. There are also extension properties that let you define 
    new properties for existing classes.
 */
fun main(args : Array<String>){

    val person_1 = Person()
    person_1.skills = "Java"
    person_1.show()

    val person_2 = Person()
    person_2.skills = "Kotlin"
    person_2.show()

    val person_3 = person_1.plus(person_2) // calling the extension function
    person_3.show()
}

// Extension function
fun Person.plus(a : Person) : Person{
    var newPerson = Person()
    newPerson.skills = this.skills + " " + a.skills // this.skills refers to current object
    return newPerson
}
