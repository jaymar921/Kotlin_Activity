/*
    Created by Jayharron @JayMar on 16/2/2022
 */

fun main(args : Array<String>){

    val str : String = "4"

    var java : Int = Integer.parseInt(str) // using the Java way
    var kotlin : Int = str.toInt()         // using the Kotlin way

    java++ // increment java
    kotlin+=2 // increment kotlin by 2
    println("Java = $java")
    println("Kotlin = $kotlin")
}
