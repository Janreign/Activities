import java.util.Date

//Scope : Use inheritance on Students
//
//Create a person class with firstname, middlename, lastname, address and birthday.
//Create a Student class that inherits the Person class. A student has a year he/she entered the school. A student has an ID.
//Create a CertificateStudent, UnderGraduateStudent, MasterStudent, and GraduateStudent.
//
//A student has different statuses
//Status : Leave of Absence, Ongoing, Graduated, Will Begin, Unknown, Shifted,
//
//The Certificate Student has a list of short courses he or she has gotten.
//
//Example:
//Student 1, Computer Technician, Network Technician, Electrical Technician
//Student 2, Public Speaking, Debate, Advertising Article
//
//
//The Undergraduate Student has a list of college(s) he or she belongs to, there is a year he or she joined the college, there is a list degrees he or she is taking, there is a start and year of the degree, there is also different statuses.
//
//Example :
//Undergraduate Student 1,  College of Engineering, Bachelor of Interior Design, 2020(start), 2022(end)
//Note : end will only contain a value if he or she is done with the course
//
//The Master Student has a list of college(s) he or she belongs to, there is a year he or she joined the college, an// d has name of the master degree he or she is getting.

//Graduate student no instruction (my note)

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

open class Person {
    var firstName = ""
    var middleName = ""
    var lastName = ""
    var address = ""
    var birthDate: Date = Date()
}

class student : Person(){
    val yearEnteredSchool: Int = 0
    val studentID = ""
}

enum class StudentStatus {
    LEAVE_OF_ABSENCE,
    ONGOING,
    GRADUATED,
    WILL_BEGIN,
    SHIFTED,
    UNKNOWN
}

class CertificateStudent {

    val shortCoursesFinished : List<String> = listOf("Introduction to Photoshop, Introduction to Cooking, 3D printing 101")
}

class UnderGraduateStudent {

    var undergraduateStudentName: String = ""
    var yearJoinedCollege = Date()
    var startAndYearOfDegree: String = ""
    var listOfCollegeBelongs = listOf("", "", "")
    var listOfDegreesTaking = listOf("","","")
    var collegeBelongsStatuses = listOf("","","")
    val courseFinishedAndEndDate:HashMap<String,String> = HashMap<String,String>(3)


class MasterStudent {

    var listOfCollegeBelongs = listOf("", "", "")
    val yearJoinedAndMasterDegreeName:HashMap<Int,String> = HashMap<Int,String>(3)

    }


class GraduateStudent{

    var listOfCollegeGraduatedAndYear :HashMap<String, Int> = HashMap<String, Int>(3)

    }

}

