import mu.KotlinLogging

private val logger = KotlinLogging.logger {}
//
//
////Covered Topic(s) : Functions
////
////Instructions :
////
////1. Create an ArrayList of bookname with 20 entries.
////2. Create a function "isBookInRecord" that will accept a String and return true if the book is found, otherwise false.
////3. Create a function "addBook" that will accept a String and add it to the ArrayList.
////4. Create a function "removeBook"  that will accept a name and remove it from the ArrayList if it exactly matches the book name.
////5. Create a function "countBooks" that will return the size of the ArrayList.
////6. Create a function "searchBookWildSearch" that will accept a String and search if that string is found with in the ArrayList, it will return an ArrayList of books that matched if there are.
////7. Create a function  "searchBookName" that will accept a String and search if there is an exact match of the String input, it will return an ArrayList of books that matched if there are.
////8.  Create a function "showBooks" that will print all the entries in the ArrayList.
//
//
fun main(){

    arrayListOfBooks()
    isBooktInRecord ()
    addBook()
//    removeBook()
//    countBookst()
//    searchBookWildSearch()
//    searchBookName()
//    showBooks()
}

fun  arrayListOfBooks() {


    var books:ArrayList<String> = ArrayList<String>()

    books.add("Anna Karenina by Leo Tolstoy (1878)")
    books.add("To Kill a Mockingbird by Harper Lee (1960)")
    books.add("Where the Sidewalk Ends by Shel Silverstein (1974)")
    books.add("Valley of the Dolls by Jacqueline Susann (1966)  ")
    books.add("The Shining by Stephen King (1977)")
    books.add("The Little Prince by Antoine de Saint-Exupéry (1943)")
    books.add("The Fellowship of the Ring by J.R.R. Tolkien (1954)")
    books.add("The Handmaid’s Tale by Margaret Atwood (1985)")
    books.add("A Wrinkle in Time by Madeleine L’Engle (1962)")
    books.add("Pride and Prejudice by Jane Austen (1813)")
    books.add("All the President’s Men by Bob Woodward and Carl Bernstein (1974)")
    books.add("Man’s Search for Meaning by Viktor E. Frankl (1946)")
    books.add("Beloved by Toni Morrison (1987)")
    books.add("In Cold Blood by Truman Capote (1965)")
    books.add("A Long Way Gone: Memoirs of a Boy Soldier by Ishmael Beah (2007)")
    books.add("Dune by Frank Herbert (1965)")
    books.add("Angela’s Ashes: A Memoir by Frank McCourt (1996)")
    books.add("Great Expectations by Charles Dickens (1861)")
    books.add("Daring Greatly: How the Courage to Be Vulnerable Transforms the Way We Live, Love, Parent, and Lead by Brené Brown (2012)")
    books.add("1984 by George Orwell (1949)")

    logger.info("Student names: ")
    for (i in books) {
        println(i)
        }
//    logger.info{isStudentInRecord()}
}

//2. Create a function "isBookInRecord" that will accept a String and return true if the book is found, otherwise false.

fun isBooktInRecord () {

    var bookTitles = ArrayList<String>()

    bookTitles.add("Anna Karenina by Leo Tolstoy (1878)")
    bookTitles.add("To Kill a Mockingbird by Harper Lee (1960)")
    bookTitles.add("Where the Sidewalk Ends by Shel Silverstein (1974)")
    bookTitles.add("Valley of the Dolls by Jacqueline Susann (1966)  ")
    bookTitles.add("The Shining by Stephen King (1977)")
    bookTitles.add("The Little Prince by Antoine de Saint-Exupéry (1943)")
    bookTitles.add("The Fellowship of the Ring by J.R.R. Tolkien (1954)")
    bookTitles.add("The Handmaid’s Tale by Margaret Atwood (1985)")
    bookTitles.add("A Wrinkle in Time by Madeleine L’Engle (1962)")
    bookTitles.add("Pride and Prejudice by Jane Austen (1813)")
    bookTitles.add("All the President’s Men by Bob Woodward and Carl Bernstein (1974)")
    bookTitles.add("Man’s Search for Meaning by Viktor E. Frankl (1946)")
    bookTitles.add("Beloved by Toni Morrison (1987)")
    bookTitles.add("In Cold Blood by Truman Capote (1965)")
    bookTitles.add("A Long Way Gone: Memoirs of a Boy Soldier by Ishmael Beah (2007)")
    bookTitles.add("Dune by Frank Herbert (1965)")
    bookTitles.add("Angela’s Ashes: A Memoir by Frank McCourt (1996)")
    bookTitles.add("Great Expectations by Charles Dickens (1861)")
    bookTitles.add("Daring Greatly: How the Courage to Be Vulnerable Transforms the Way We Live, Love, Parent, and Lead by Brené Brown (2012)")
    bookTitles.add("1984 by George Orwell (1949)")

    println("Search name to check if the book is in record: ")
    val element: String = readln()

    if (bookTitles.contains(element)) {
        print("Element: $element is present in the list: $bookTitles.")
    } else {bookTitles
        print("Element: $element is not present in the list: $bookTitles.")
    }

    println()
    println()
}

////    3. Create a function "addStudent" that will accept a name and add it to the ArrayList.
//
//
    fun addBook(){

    var studentNames = ArrayList<String>()

    studentNames.add("Jayson")
    studentNames.add("Lyca")
    studentNames.add("Princess")
    studentNames.add("Robert")
    studentNames.add("Julie")
    studentNames.add("Maricris")
    studentNames.add("Angel")
    studentNames.add("Danilo")
    studentNames.add("Paulo")
    studentNames.add("Mark")
    studentNames.add("Rafael")
    studentNames.add("Ronald")
    studentNames.add("Michelle")
    studentNames.add("Nitoy")
    studentNames.add("Fernanda")
    studentNames.add("Sofia")
    studentNames.add("Mary Anne")
    studentNames.add("Juvy")
    studentNames.add("Rose Anne")
    studentNames.add("Michael")

    println("Enter name to add on the list: ")
    var addName = readln()
    studentNames.add(addName)
    println("List of names: " + studentNames)

    }

//4. Create a function "removeStudent"  that will accept a name and remove it from the ArrayList.

fun removeStudent(){

var studentNames = ArrayList<String>()

studentNames.add("Jayson")
studentNames.add("Lyca")
studentNames.add("Princess")
studentNames.add("Robert")
studentNames.add("Julie")
studentNames.add("Maricris")
studentNames.add("Angel")
studentNames.add("Danilo")
studentNames.add("Paulo")
studentNames.add("Mark")
studentNames.add("Rafael")
studentNames.add("Ronald")
studentNames.add("Michelle")
studentNames.add("Nitoy")
studentNames.add("Fernanda")
studentNames.add("Sofia")
studentNames.add("Mary Anne")
studentNames.add("Juvy")
studentNames.add("Rose Anne")
studentNames.add("Michael")

println("Enter name to remove on the list: ")
var removeName = readln()
studentNames.remove(removeName)
println("List of names: " + studentNames)
println()

}

//5. Create a function "countStudent" that will return the size of the ArrayList.
fun countStudent  () {

    var studentNames = ArrayList<String>()
    studentNames.add("Jayson")
    studentNames.add("Lyca")
    studentNames.add("Princess")
    studentNames.add("Robert")
    studentNames.add("Julie")
    studentNames.add("Maricris")
    studentNames.add("Angel")
    studentNames.add("Danilo")
    studentNames.add("Paulo")
    studentNames.add("Mark")
    studentNames.add("Rafael")
    studentNames.add("Ronald")
    studentNames.add("Michelle")
    studentNames.add("Nitoy")
    studentNames.add("Fernanda")
    studentNames.add("Sofia")
    studentNames.add("Mary Anne")
    studentNames.add("Juvy")
    studentNames.add("Rose Anne")
    studentNames.add("Michael")

    println("This will show how many names are on the list: ")
    println(studentNames.size)
}

//6. Create a function "searchStudentWildSearch" that will accept a String and search if// that string is found with in the ArrayList, it will return an ArrayList of names that matched if there are.

fun searchStudentWildSearch() {

    var studentNames = ArrayList<String>()

    studentNames.add("Jayson")
    studentNames.add("Lyca")
    studentNames.add("Princess")
    studentNames.add("Robert")
    studentNames.add("Julie")
    studentNames.add("Maricris")
    studentNames.add("Angel")
    studentNames.add("Danilo")
    studentNames.add("Paulo")
    studentNames.add("Mark")
    studentNames.add("Rafael")
    studentNames.add("Ronald")
    studentNames.add("Michelle")
    studentNames.add("Nitoy")
    studentNames.add("Fernanda")
    studentNames.add("Sofia")
    studentNames.add("Mary Anne")
    studentNames.add("Juvy")
    studentNames.add("Rose Anne")
    studentNames.add("Michael")

    println("Search name to check if the student is in record: ")
    val element: String = readln()

    if (studentNames.contains(element)) {
        print("Element: $element is present in the list: $studentNames.")
    } else {studentNames
        print("Element: $element is not present in the list: $studentNames.")
    }

    println()
    println()
}

//7. Create a function  "searchStudentName" that will accept a String and search if there is an exact match of the String input, it will return an ArrayList of names that matched if there are.

fun searchStudentName() {

    var studentNames = ArrayList<String>()

    studentNames.add("Jayson")
    studentNames.add("Lyca")
    studentNames.add("Princess")
    studentNames.add("Robert")
    studentNames.add("Julie")
    studentNames.add("Maricris")
    studentNames.add("Angel")
    studentNames.add("Danilo")
    studentNames.add("Paulo")
    studentNames.add("Mark")
    studentNames.add("Rafael")
    studentNames.add("Ronald")
    studentNames.add("Michelle")
    studentNames.add("Nitoy")
    studentNames.add("Fernanda")
    studentNames.add("Sofia")
    studentNames.add("Mary Anne")
    studentNames.add("Juvy")
    studentNames.add("Rose Anne")
    studentNames.add("Michael")

    println("Search name to check if the student is in record: ")
    val element: String = readln()

    if (studentNames.contains(element)) {
        print("Element: $element is present in the list: $studentNames.")
    } else {studentNames
        print("Element: $element is not present in the list: $studentNames.")
    }

    println()
    println()
}

//8. Create a function "searchStudent" that will accept a String and call "searchStudentWildSearch" if the String input is less than or equal to three, and it will call "searchStudentName" if the String input is greater than three.

fun searchStudent() {

    var studentNames = ArrayList<String>()

    studentNames.add("Jayson")
    studentNames.add("Lyca")
    studentNames.add("Princess")
    studentNames.add("Robert")
    studentNames.add("Julie")
    studentNames.add("Maricris")
    studentNames.add("Angel")
    studentNames.add("Danilo")
    studentNames.add("Paulo")
    studentNames.add("Mark")
    studentNames.add("Rafael")
    studentNames.add("Ronald")
    studentNames.add("Michelle")
    studentNames.add("Nitoy")
    studentNames.add("Fernanda")
    studentNames.add("Sofia")
    studentNames.add("Mary Anne")
    studentNames.add("Juvy")
    studentNames.add("Rose Anne")
    studentNames.add("Michael")

    println("Search name to check if the student is in record: ")
    val element: String = readln()

    if (studentNames.contains(element)) {
        print("Element: $element is present in the list: $studentNames.")
    } else {studentNames
        print("Element: $element is not present in the list: $studentNames.")
    }

    println()
    println()
}

//9.  Create a function "showStudents" that will print all the entries in the ArrayList.

fun showStudents() {

    var studentNames = ArrayList<String>()

    studentNames.add("Jayson")
    studentNames.add("Lyca")
    studentNames.add("Princess")
    studentNames.add("Robert")
    studentNames.add("Julie")
    studentNames.add("Maricris")
    studentNames.add("Angel")
    studentNames.add("Danilo")
    studentNames.add("Paulo")
    studentNames.add("Mark")
    studentNames.add("Rafael")
    studentNames.add("Ronald")
    studentNames.add("Michelle")
    studentNames.add("Nitoy")
    studentNames.add("Fernanda")
    studentNames.add("Sofia")
    studentNames.add("Mary Anne")
    studentNames.add("Juvy")
    studentNames.add("Rose Anne")
    studentNames.add("Michael")


    println("This will show the studentNames: ")
    println(studentNames)

}
