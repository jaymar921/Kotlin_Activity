fun main(args:Array<String>){

    // constant variables
    val num1 : Int = 200;
    val num2 : Int = 145;

    // call the functions
    printResult("Addition of $num1 and $num2 is ", addition(num1,num2))
    printResult("Subtraction of $num1 and $num2 is ", subtraction(num1,num2))
    printResult("Multiplication of $num1 and $num2 is ", multiplication(num1,num2))
    printResult("Division of $num1 and $num2 is ", division(num1,num2))

}


fun addition(a : Int, b : Int) : Int{
    return a + b;
}

/**
 *  it can be
 *  fun addition(a : Int, b : Int) : Int = a + b
 * */

fun multiplication(a : Int, b : Int) : Int{
    return a * b;
}

fun subtraction(a : Int, b : Int) : Int{
    return a - b;
}

fun division(a : Int, b : Int) : Int{
    return a / b;
}

fun printResult(message : String,result : Int){
    println("$message $result")
}