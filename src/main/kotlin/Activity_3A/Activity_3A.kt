//
//import mu.KotlinLogging
//
//private val logger = KotlinLogging.logger {}
//
////Covered Topic(s) : Functions
////
////Instructions :
////
////Note: Names are single word with no spaces example, "Marco", "Eugene", "Sarah", "Isaiah", "Anthony", "Henry".
////
////
//1. Create an ArrayList of names with 20 entries.
//2. Create a function "isStudentInRecord" that will accept a name and return true if the name is found, otherwise false.
//3. Create a function "addStudent" that will accept a name and add it to the ArrayList.
//4. Create a function "removeStudent"  that will accept a name and remove it from the ArrayList.
//5. Create a function "countStudent" that will return the size of the ArrayList.
//6. Create a function "searchStudentWildSearch" that will accept a String and search if that string is found with in the ArrayList, it will return an ArrayList of names that matched if there are.
//7. Create a function  "searchStudentName" that will accept a String and search if there is an exact match of the String input, it will return an ArrayList of names that matched if there are.
//8. Create a function "searchStudent" that will accept a String and call "searchStudentWildSearch" if the String input is less than or equal to three, and it will call "searchStudentName" if the String input is greater than three.
//9.  Create a function "showStudents" that will print all the entries in the ArrayList.
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
////1. Create an ArrayList of names with 20 entries.
//


fun main(){
//
//    arrayListOfNames()
//    isStudentInRecord ()
//    addStudent()
//    removeStudent()
//    countStudent()
//    searchStudentWildSearch()
//    showStudents()
//    searchStudent()
//    showStudents()
//}
//
//fun  arrayListOfNames() {
//
//
//    var names:ArrayList<String> = ArrayList<String>()
//
//    names.add("Jayson")
//    names.add("Lyca")
//    names.add("Princess")
//    names.add("Robert")
//    names.add("Julie")
//    names.add("Maricris")
//    names.add("Angel")
//    names.add("Danilo")
//    names.add("Paulo")
//    names.add("Mark")
//    names.add("Rafael")
//    names.add("Ronald")
//    names.add("Michelle")
//    names.add("Nitoy")
//    names.add("Fernanda")
//    names.add("Sofia")
//    names.add("Mary Anne")
//    names.add("Juvy")
//    names.add("Rose Anne")
//    names.add("Michael")
//    logger.info("Student names: ")
//    for (i in names) {
//        println(i)
//
//        }
////    logger.info{isStudentInRecord()}
//}
//
////2. Create a function "isStudentInRecord" that will accept a name and return true if the name is found, otherwise false.
//
//fun isStudentInRecord () {
//
//    var studentNames = ArrayList<String>()
//
//    studentNames.add("Jayson")
//    studentNames.add("Lyca")
//    studentNames.add("Princess")
//    studentNames.add("Robert")
//    studentNames.add("Julie")
//    studentNames.add("Maricris")
//    studentNames.add("Angel")
//    studentNames.add("Danilo")
//    studentNames.add("Paulo")
//    studentNames.add("Mark")
//    studentNames.add("Rafael")
//    studentNames.add("Ronald")
//    studentNames.add("Michelle")
//    studentNames.add("Nitoy")
//    studentNames.add("Fernanda")
//    studentNames.add("Sofia")
//    studentNames.add("Mary Anne")
//    studentNames.add("Juvy")
//    studentNames.add("Rose Anne")
//    studentNames.add("Michael")
//
//    println("Search name to check if the student is in record: ")
//    val element: String = readln()
//
//    if (studentNames.contains(element)) {
//        print("Element: $element is present in the list: $studentNames.")
//    } else {studentNames
//        print("Element: $element is not present in the list: $studentNames.")
//    }
//
//    println()
//    println()
//}
//
//////    3. Create a function "addStudent" that will accept a name and add it to the ArrayList.
////
////
//    fun addStudent(){
//
//    var studentNames = ArrayList<String>()
//
//    studentNames.add("Jayson")
//    studentNames.add("Lyca")
//    studentNames.add("Princess")
//    studentNames.add("Robert")
//    studentNames.add("Julie")
//    studentNames.add("Maricris")
//    studentNames.add("Angel")
//    studentNames.add("Danilo")
//    studentNames.add("Paulo")
//    studentNames.add("Mark")
//    studentNames.add("Rafael")
//    studentNames.add("Ronald")
//    studentNames.add("Michelle")
//    studentNames.add("Nitoy")
//    studentNames.add("Fernanda")
//    studentNames.add("Sofia")
//    studentNames.add("Mary Anne")
//    studentNames.add("Juvy")
//    studentNames.add("Rose Anne")
//    studentNames.add("Michael")
//
//    println("Enter name to add on the list: ")
//    var addName = readln()
//    studentNames.add(addName)
//    println("List of names: " + studentNames)
//
//    }
//
////4. Create a function "removeStudent"  that will accept a name and remove it from the ArrayList.
//
//fun removeStudent(){
//
//var studentNames = ArrayList<String>()
//
//studentNames.add("Jayson")
//studentNames.add("Lyca")
//studentNames.add("Princess")
//studentNames.add("Robert")
//studentNames.add("Julie")
//studentNames.add("Maricris")
//studentNames.add("Angel")
//studentNames.add("Danilo")
//studentNames.add("Paulo")
//studentNames.add("Mark")
//studentNames.add("Rafael")
//studentNames.add("Ronald")
//studentNames.add("Michelle")
//studentNames.add("Nitoy")
//studentNames.add("Fernanda")
//studentNames.add("Sofia")
//studentNames.add("Mary Anne")
//studentNames.add("Juvy")
//studentNames.add("Rose Anne")
//studentNames.add("Michael")
//
//println("Enter name to remove on the list: ")
//var removeName = readln()
//studentNames.remove(removeName)
//println("List of names: " + studentNames)
//println()
//
//}
//
////5. Create a function "countStudent" that will return the size of the ArrayList.
//fun countStudent  () {
//
//    var studentNames = ArrayList<String>()
//    studentNames.add("Jayson")
//    studentNames.add("Lyca")
//    studentNames.add("Princess")
//    studentNames.add("Robert")
//    studentNames.add("Julie")
//    studentNames.add("Maricris")
//    studentNames.add("Angel")
//    studentNames.add("Danilo")
//    studentNames.add("Paulo")
//    studentNames.add("Mark")
//    studentNames.add("Rafael")
//    studentNames.add("Ronald")
//    studentNames.add("Michelle")
//    studentNames.add("Nitoy")
//    studentNames.add("Fernanda")
//    studentNames.add("Sofia")
//    studentNames.add("Mary Anne")
//    studentNames.add("Juvy")
//    studentNames.add("Rose Anne")
//    studentNames.add("Michael")
//
//    println("This will show how many names are on the list: ")
//    println(studentNames.size)
//}
//
////6. Create a function "searchStudentWildSearch" that will accept a String and search if// that string is found with in the ArrayList, it will return an ArrayList of names that matched if there are.
//
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


var studentsMiddleNames = ArrayList<String>()

    studentsMiddleNames.add("Jayson")
    studentsMiddleNames.add("Lyca")
    studentsMiddleNames.add("Princess")
    studentsMiddleNames.add("Robert")
    studentsMiddleNames.add("Julie")
    studentsMiddleNames.add("Maricris")
    studentsMiddleNames.add("Angel")
    studentsMiddleNames.add("Danilo")
    studentsMiddleNames.add("Paulo")
    studentsMiddleNames.add("Mark")
    studentsMiddleNames.add("Rafael")
    studentsMiddleNames.add("Ronald")
    studentsMiddleNames.add("Michelle")
    studentsMiddleNames.add("Nitoy")
    studentsMiddleNames.add("Fernanda")
    studentsMiddleNames.add("Sofia")
    studentsMiddleNames.add("Mary Anne")
    studentsMiddleNames.add("Juvy")
    studentsMiddleNames.add("Rose Anne")
    studentsMiddleNames.add("Michael")


var studentsLastNames = ArrayList<String>()
    studentsLastNames.add("Lyca")
    studentsLastNames.add("Princess")
    studentsLastNames.add("Robert")
    studentsLastNames.add("Julie")
    studentsLastNames.add("Maricris")
    studentsLastNames.add("Angel")
    studentsLastNames.add("Danilo")
    studentsLastNames.add("Paulo")
    studentsLastNames.add("Mark")
    studentsLastNames.add("Rafael")
    studentsLastNames.add("Ronald")
    studentsLastNames.add("Michelle")
    studentsLastNames.add("Nitoy")
    studentsLastNames.add("Fernanda")
    studentsLastNames.add("Sofia")
    studentsLastNames.add("Mary Anne")
    studentsLastNames.add("Juvy")
    studentsLastNames.add("Rose Anne")
    studentsLastNames.add("Michael")


    ///Need to update
    println("Search name to check if the student is in record: ")
    val element: String = readln()

    if (studentNames.contains(element)) {
        print("Element: $element is present in the list: $studentNames.")
    } else {studentNames
        print("Element: $element is not present in the list: $studentNames.")
    }



}
//
//    println()
//    println()
//}
//
////7. Create a function  "searchStudentName" that will accept a String and search if there is an exact match of the String input, it will return an ArrayList of names that matched if there are.
//
//fun searchStudentName() {
//
//    var studentNames = ArrayList<String>()
//
//    studentNames.add("Jayson")
//    studentNames.add("Lyca")
//    studentNames.add("Princess")
//    studentNames.add("Robert")
//    studentNames.add("Julie")
//    studentNames.add("Maricris")
//    studentNames.add("Angel")
//    studentNames.add("Danilo")
//    studentNames.add("Paulo")
//    studentNames.add("Mark")
//    studentNames.add("Rafael")
//    studentNames.add("Ronald")
//    studentNames.add("Michelle")
//    studentNames.add("Nitoy")
//    studentNames.add("Fernanda")
//    studentNames.add("Sofia")
//    studentNames.add("Mary Anne")
//    studentNames.add("Juvy")
//    studentNames.add("Rose Anne")
//    studentNames.add("Michael")
//
//    println("Search name to check if the student is in record: ")
//    val element: String = readln()
//
//    if (studentNames.contains(element)) {
//        print("Element: $element is present in the list: $studentNames.")
//    } else {studentNames
//        print("Element: $element is not present in the list: $studentNames.")
//    }
//
//    println()
//    println()
//}
//
////8. Create a function "searchStudent" that will accept a String and call "searchStudentWildSearch" if the String input is less than or equal to three, and it will call "searchStudentName" if the String input is greater than three.
//
//fun searchStudent() {
//
//    var studentNames = ArrayList<String>()
//
//    studentNames.add("Jayson")
//    studentNames.add("Lyca")
//    studentNames.add("Princess")
//    studentNames.add("Robert")
//    studentNames.add("Julie")
//    studentNames.add("Maricris")
//    studentNames.add("Angel")
//    studentNames.add("Danilo")
//    studentNames.add("Paulo")
//    studentNames.add("Mark")
//    studentNames.add("Rafael")
//    studentNames.add("Ronald")
//    studentNames.add("Michelle")
//    studentNames.add("Nitoy")
//    studentNames.add("Fernanda")
//    studentNames.add("Sofia")
//    studentNames.add("Mary Anne")
//    studentNames.add("Juvy")
//    studentNames.add("Rose Anne")
//    studentNames.add("Michael")
//
//    println("Search name to check if the student is in record: ")
//    val element: String = readln()
//
//    if (studentNames.contains(element)) {
//        print("Element: $element is present in the list: $studentNames.")
//    } else {studentNames
//        print("Element: $element is not present in the list: $studentNames.")
//    }
//
//    println()
//    println()
//}
//
////9.  Create a function "showStudents" that will print all the entries in the ArrayList.
//
//fun showStudents() {
//
//    var studentNames = ArrayList<String>()
//
//    studentNames.add("Jayson")
//    studentNames.add("Lyca")
//    studentNames.add("Princess")
//    studentNames.add("Robert")
//    studentNames.add("Julie")
//    studentNames.add("Maricris")
//    studentNames.add("Angel")
//    studentNames.add("Danilo")
//    studentNames.add("Paulo")
//    studentNames.add("Mark")
//    studentNames.add("Rafael")
//    studentNames.add("Ronald")
//    studentNames.add("Michelle")
//    studentNames.add("Nitoy")
//    studentNames.add("Fernanda")
//    studentNames.add("Sofia")
//    studentNames.add("Mary Anne")
//    studentNames.add("Juvy")
//    studentNames.add("Rose Anne")
//    studentNames.add("Michael")
//
//
//    println("This will show the studentNames: ")
//    println(studentNames)
//
}


