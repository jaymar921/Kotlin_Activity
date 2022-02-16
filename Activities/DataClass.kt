/*
    Created by Jayharron @JayMar on 16/2/2022
 */

// Data class has all this features
// 1. every class needs a toString() methods(functions), data class has it
// 2. override equals and hashCode methods(functions)
// 3. copy, being able to copy an instance to a class to another

data class Laptop(val brand : String, val price : Int){

}
fun main(args : Array<String>){
    val laptop1 = Laptop("Dell",2000)
    val laptop2 = Laptop("Asus",3250)

    val laptop3 = laptop1.copy()

    println("Laptop 1: $laptop1")
    println("Laptop 2: $laptop1")
    println("Laptop 1 equals Laptop 2: ${laptop2==laptop2}")
    println("Laptop 3: $laptop1")
}