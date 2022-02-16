/*
    Created by Jayharron @JayMar on 16/2/2022
 */
interface Zombie{
    fun think()
}
fun main(){

    val zombie : Zombie = object : Zombie{
        override fun think(){
            println("Zombie is thinking about brains")
        }
    }

    zombie.think()
}