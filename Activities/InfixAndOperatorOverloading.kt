/*
    Created by Jayharron @JayMar on 16/2/2022

    Required @Person.kt
 */
fun main(args : Array<String>){

    val person_1 = Person()
    person_1.skills = "Java"
    person_1.show()

    val person_2 = Person()
    person_2.skills = "Kotlin"
    person_2.show()

    val person_3 = person_1 plus person_2 // call the infix function
    person_3.show()

    val person_4 = person_2 + person_3 // call the operator overloaded function
    person_4.show()
}

// Infix Function
infix operator fun Person.plus(a : Person) : Person{
    var newPerson = Person()
    newPerson.skills = this.skills + " " + a.skills // this.skills refers to current object
    return newPerson
}