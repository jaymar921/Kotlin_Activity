import java.util.scanner

/*
    Input 10 integers.
    Display the total count of
    positive,
    negative,
    odd numbers,
    even numbers,
    largest and
    smallest numbers
*/
fun main(){
    //scanner object
    val scanner = Scanner(System.`in`)

    //variables
    var positive:Int = 0;
    var negative:Int = 0;
    var oddNumber:Int = 0;
    var evenNumber:Int = 0;
    var largest:Int = 0;
    var smallest:Int = 0;
    println("Enter 10 integers")

    val range = 1..10
    for(i in range){
        val input = scanner.nextInt();
        // condition for counting positive and negative Integers
        if(input > 0)
            positive++;
        else if(input < 0)
            negative++;

        // condition for counting odd and even Integers
        if(input%2==0)
            evenNumber++;
        else
            oddNumber++;

        // condition for getting the smallest and largest Integer
        if(input > largest)
            largest = input;
        if(input<=smallest)
            smallest = input;
    }
    println("Positive Integers: $positive")
    println("Negative Integers: $negative")
    println("Even Integers: $evenNumber")
    println("Odd Integers: $oddNumber")
    println("Largest Integers: $largest")
    println("Smallest Integers: $smallest")

}
