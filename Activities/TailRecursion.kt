import java.math.BigInteger

/*
    Created by Jayharron @JayMar on 16/2/2022
 */
fun main(args : Array<String>){

    val bigNum = BigInteger("5000")

    println(factorialBig(bigNum, BigInteger.ONE))
}


tailrec fun factorialBig(num : BigInteger, result : BigInteger) : BigInteger {
    return if(num == BigInteger.ZERO)
        result
    else
        factorialBig(num - BigInteger.ONE, num*result)
}