/*
    Created by Jayharron @JayMar on 16/2/2022
 */
interface A{
    fun show()
    fun abc(){
        println("in abc function from interface A")
    }
}

interface B{
    fun display(item : String)
    fun abc(){
        println("in abc function from interface B")
    }
}

class C : A,B{ // class C implements A and B
    override fun show() {
        println("Kotlin is cooler")
    }
    override fun display(item: String) {
        println(item)
    }
    override fun abc(){
        super<A>.abc()
        super<B>.abc()
        println("in abc function from class C")
    }
}

fun main(args : Array<String>){
    val obj = C()
    obj.display("Java is nice")
    obj.show()
    obj.abc()
}