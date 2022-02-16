/*
    Created by Jayharron @JayMar on 16/2/2022

    In Kotlin, if you want to write a function or any member of the class that
    can be called without having the instance of the class then you can write
    the same as a member of a companion object inside the class.

    Unlike Java or C#, Kotlin doesn't have static members or member functions.
    If you need to write a function that can be called without having a class
    instance but needs access to the internals of a class, you can write it as
    a member of a companion object declaration inside that class.
 */
class CompanionObject{
    companion object{
        @JvmStatic // allows Java code to call this method statically
        fun show(){
            println("Hello")
        }
        fun create() : CompanionObject = CompanionObject() //factory method
    }
    fun display(){
        println("Hello")
    }
}

fun main(){
    CompanionObject.show()

    val obj = CompanionObject.create();
    obj.display()
}