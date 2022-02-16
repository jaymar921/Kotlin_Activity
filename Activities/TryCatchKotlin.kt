import java.lang.NumberFormatException

/*
    Created by Jayharron @JayMar on 16/2/2022
 */

fun main(args : Array<String>){

    val str : String = "4a"

    var kotlin : Int = 0

    // use try catch in Java way
    try {
        kotlin = str.toInt()
    }catch (e : NumberFormatException){
        println("Give proper input")
    }finally {
        kotlin+=2 // increment kotlin by 2
    }

    println("Kotlin = $kotlin")

    // use try as expression
    val num : Int = try{
        str.toInt()
    }catch (e : NumberFormatException){
        0
    }

    println("Result of num is $num")
}