import java.math.BigInteger

/*
    Created by Jayharron @JayMar on 16/2/2022
 */
fun main(args : Array<String>){

    val num = 5
    val bigNum = BigInteger("100")

    //    Factorial in for loop

    //    var fact = 1
    //    for(i in 1..num){
    //        fact *= i
    //    }
    //    println(fact)

    println(factorial(num))
    println(factorialBig(bigNum))
}

fun factorial(num : Int) : Int{ // limited to small numbers
    return if(num == 0)
        1
    else
        num * factorial(num-1)
}

fun factorialBig(num : BigInteger) : BigInteger{
    return if(num == BigInteger.ZERO)
        BigInteger.ONE
    else
        num * factorialBig(num - BigInteger.ONE)
}