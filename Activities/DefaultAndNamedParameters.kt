
fun main(args : Array<String>){

    var finalAmt = calcAmount(50) // using the default parameter, interest = 0.04
    println(finalAmt)
    
    var finalAmt = calcAmount(50, 0.02) // using the default parameter
    println(finalAmt)

    finalAmt = calcAmount(amount = 100, interest = 0.03) // using named parameter
    println(finalAmt)

    finalAmt = calcAmount(interest = 0.03, amount = 100) // it can be interchanged
    println(finalAmt)
}

@JvmOverloads // Optional, it will create 2 methods for Java to use default and named @params
fun calcAmount(amount : Int, interest : Double = 0.04) : Int{
    return (amount + amount * interest).toInt()
}
