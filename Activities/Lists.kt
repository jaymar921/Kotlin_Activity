/*
    Created by Jayharron @JayMar on 16/2/2022
 */
fun main(){

    val values = listOf<String>("Jayharron", "Pia", "Kent", "Jester", "Pabz", "Arlo", "Alvin")

    println("List of names")
    for(names in values)
        print("$names   ")
    println("\nname in index 1 is ${values[1]}")

    val mutableList = mutableListOf<String>("Dog","Cat")
    mutableList.add("Bird")
    mutableList.add("Chicken")

    println("List of animals")
    for(animals in mutableList)
        print("$animals   ")
}