//Covered Topic(s) : Classes
//
//
//Instructions :
//
//1. Use class to represent the student rather string.Make sure the student has a firstName, lastName, nickName, id and year enrolled
//
//2. Update the searchStudentWildSearch to search for the wild string in the lastname, middle name, and firstname. Return the Arraylist of students that match the searched string, if there are no entries return an empty ArrayList.
//
//3. Add a function searchStudentWildSearch that will accept a string and either of the following values, lastname, middlename, nickname. This will search the specific wild string depending where it was mentioned to be searched for. Return the Arraylist of students that match the searched string, if there are no entries return an empty ArrayList.

//

//////////////////////////////////////////////////////////////////////////////////

//package Activity_4A
//
class Student {

    var firstName = ""
    var lastName = ""
    var nickName = ""
    var id = ""
    var yearEnrolled = 0


    fun main() {
        val s1 = Student()

        s1.firstName = "Juan"
        s1.firstName = "De la Cruz"
        s1.nickName = "Jun"
        s1.id = "4587ahy"
        s1.yearEnrolled = 2015

        println(s1.firstName)
        println(s1.firstName)
        println(s1.nickName)
        println(s1.firstName)
        println(s1.firstName)



        fun searchStudent () {

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

            println("Search name to check if the student is in record: ")
            val element: String = readln()

            if (studentNames.contains(element)) {
                print("Element: $element is present in the list: $studentNames.")
            } else {
                studentNames
                print("Element: $element is not present in the list: $studentNames.")
            }

        }
    }


//    Add a function searchStudentWildSearch that will accept a string and either of the following values, lastname, middlename, nickname. This will search the specific wild string depending where it was mentioned to be searched for. Return the Arraylist of students that match the searched string, if there are no entries return an empty ArrayList.

    fun searchStudentWildSearch (){

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

        println("Search name to check if the student is in record: ")
        val element: String = readln()

        if (element.contains(element)) {
            print("Element: $element is present in the list: $studentNames $studentsMiddleNames $studentsLastNames .")
        } else {
            studentNames
            print("Element: $element is not present in the list: $studentNames.")
        }

    }
}

