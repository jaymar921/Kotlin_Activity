/*
    Created by Jayharron @JayMar on 16/2/2022
 */
fun main(){

    val numbers = intArrayOf(10,12,14,16) // if you know the size and its values, size is fixed

    // changing values, must refer to the index number
    numbers[1] = 25
    numbers[3] = 15

    for(i in numbers)
        println(i)

    println()
    val numbers1 = IntArray(3) // with size
    numbers1[0] = 25

    for(i in numbers1)
        println(i)

    println()
    val names = arrayOfNulls<String>(2) //Arrays of Objects
    names[0] = "Jayharron"
    names[1] = "Pia"
    for(i in names)
        println(i)
}