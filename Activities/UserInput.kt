import java.util.*

/*
    Created by Jayharron @JayMar on 16/2/2022
 */
fun main(){
    // method 1
    var scanner = Scanner(System.`in`)

    print("Enter a number: ")
    var num = scanner.nextInt()

    println(num)

    // method 2
    print("Enter a number: ")
    var num1 = readLine()
    println(num1) // result is string, you need to convert it to int
}