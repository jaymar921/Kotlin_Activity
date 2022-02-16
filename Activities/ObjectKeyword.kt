/*
    Created by Jayharron @JayMar on 16/2/2022
 */
data class Book(val name : String, val price : Int){}

object BookShelf{ // making the class a singleton object
    var books = arrayListOf<Book>()

    fun showBooks(){
        for(i in books){
            println(i)
        }
    }
}

fun main(args : Array<String>){
    BookShelf.books.add(Book("Java",50))
    BookShelf.books.add(Book("SQL",40))
    BookShelf.books.add(Book("Kotlin",80))

    BookShelf.showBooks()
}