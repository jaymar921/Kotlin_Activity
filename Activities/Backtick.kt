/*
    Created by Jayharron @JayMar on 16/2/2022

    Escaping for Java identifiers that are keywords in Kotlin
    Some of Kotlin keywords are valid identifiers in Java: in,
    object, is, etc. If a Java library uses a Kotlin keyword for a
    method, you can still call the method escaping it with the backtick (`) character
 */

fun `in`(){
    println("`in` is a reserved keyword")
}
fun main(){
    `in`()
}