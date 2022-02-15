import java.util.Scanner

/**
 *  A simple Kotlin program that
 *  ask for a 3 digits number and
 *  display each digit
 * */
fun main(){

    val scanner = Scanner(System.`in`);

    var digit_1: Int = 0
    var digit_2: Int = 0
    var digit_3: Int = 0

    println("Enter a number: ")
    val input = scanner.nextInt();

    digit_1 = input / 100;
    digit_2 = input % 100 / 10;
    digit_3 = input % 100 % 10 / 1;
    
    // note that there is no try catch here, it means that if you entered a letter, it will throw an exception

    println("1st digit is $digit_1")
    println("2nd digit is $digit_2")
    println("3rd digit is $digit_3")

}
