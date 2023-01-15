import java.util.Date
//
//package Activity_4B
//
//class Activity_4B {
//}

//Covered Topic(s) : Classes
//
//
//Instructions :
//
//1. Use class to represent the Book rather string.
//
//A book has a title, authors, year published, edition, ISBN, publisher.
//
//A book may have a list of chapters.
//
//A book has a number of pages.


////////////////////////////////////////////////////////////////

class Book {

    //attributes

    var title: String = ""
    var authors: String = ""
    var yearPublished: Int = 0
    var edition: String = ""
    var ISBN: String = ""
    var publisher: String = ""
    var chapters = listOf("Chapter 1","Chapter 2","Chapter 3")
    var pages: Int = 0


//
//        fun main() {
//        val b1 = Book()
//
//        b1.title = ""
//        b1.authors = ""
//        b1.yearPublished = 0
//        b1.edition = ""
//        b1.ISBN = ""
//        b1.publisher = ""
//
//        println(b1.title)
//        println(b1.authors)
//        println(b1.yearPublished)
//        println(b1.edition)
//        println(b1.publisher)
//    }
}



//2. Add a class for magazines.
//
//A magazine has an editor, a title, a month published, a year published


class Magazine: Article() {

    //attributes

    var magazineTitle: String = ""
    var authors: String = ""
    var yearPublished: Int = 0
    var edition: String = ""
    var ISBN: String = ""
    var publisher: String = ""
    var chapters = listOf("Chapter 1","Chapter 2","Chapter 3")
    var pages: Int = 0

//
//    fun main() {
//        val m1 = Magazine()
//
//        m1.title = ""
//        m1.authors = ""
//        m1.yearPublished = 0
//        m1.edition = ""
//        m1.ISBN = ""
//        m1.publisher = ""
//
//        println(m1.title)
//        println(m1.authors)
//        println(m1.yearPublished)
//        println(m1.edition)
//        println(m1.publisher)
    }


//3. Add a class for newspaper.
//
//A newspaper has a name, day published, month published, year published and headline.

    class Newspaper : Article(){

        //attributes

        var name = ""
        var dayPublished = 0
        var monthPublished = ""
        var yearPublished: Int = 0
        var headLine: String = ""

        }



//4. Add a class Authors.
//
//Authors have firstName, lastName, middleName, date of birth.
//


        class Authors {

            //attributes

            var firstName: String = ""
            var middleName: String = ""
            var lastName: Int = 0
            var dateOfBirth = Date()

            }



//5. Add a class Comics.
//
//A comic has a title, month published, year published, illustrators, publisher.

//Create a class illustrator.
//
//Illustrator have firstName, lastName, middleName, date of birth.


        class Comics {

            //attributes

            var title: String = ""
            var monthPublished: String = ""
            var yearPublished: Int = 0
            var illustrators: String = ""
            var publisher: String = ""


            class Illustrator {

                //attributes
                var firstName: String = ""
                var middleName: String = ""
                var lastName: Int = 0
                var dateOfBirth = Date()

            }
        }


//6. Add a class Article.
//
//An article has a title, content, author.
//
//A Newspaper, and magazine have articles.

       open class Article {
            //attributes

            var title: String = ""
            var content: String = ""
            var author: String = ""

        }




//7. Create a search function to search for the title of a magazine, newspaper, comics.

fun searchTitle (){

    var titles = arrayListOf<String>("Naruto", "Guitar Magazine 2018", "U.S Attacked")

    var findTitle = readln()

    println("Search titles: ")
    val element: String = readln()

    if (titles.contains(element)) {
        print("Element: $element is present in the list: $titles.")
    } else {titles
        print("Element: $element is not present in the list: $titles.")
    }
}

//8. Create a function that will list the name of the magazine, newspaper, comics or book, author has written in.

fun authorWritten () {

    var authorPublished = ArrayList<String>()

    authorPublished.add("Sample1")
    authorPublished.add("Sample2")
    println(authorPublished)

}


//9. Create a class for Audio / Video recording. The class should show whether the recording has a video or audio or both.
//It has a length, date recorded, title, publisher.

class AudioAndVideoRecording {

    //attributes
    var length = 0
    var dateRecorded = Date()
    var title: String = ""
    var publisher: String = ""

}

//10. Create a Publisher class.

//A publisher a name, address and date established.

class Publisher {

    var name: String = ""
    var address: String = ""
    var dateEstablished = Date()

}




