//Implement Activity 01 -  A using data structure.
//
//You are tasked to create a directory of the students taking this course.
//The data will be used to send updates regarding the classes.
//There is also a need to know the progress of the students during the progress of this course.
//List down all data that can be used to implement this. Use the proper data types.

import mu.KotlinLogging
import javax.naming.Name

private val logger = KotlinLogging.logger {}
//
fun main () {

//////***Student Information***/////
//
    val batchNumber = "MD2P"
    var studentNames: List<String> = mutableListOf<String>(
        "Vismar",
        "Jason",
        "Janreign",
        "Noe",
        "John Rey",
        "Joni James",
        "Ebrahim",
        "Laurence",
        "Ma Mickaella",
        "Patricia",
        "Mark Lestert",
        "Matthew",
        "James",
        "Joel",
        "Rene",
        "Ryan",
        "Romie",
        "Mary Jean",
        "James Nico",
        "Gino",
        "John Patrick",
        "Juan",
        "Paulo",
        "Carlo",
        "Victor"
    )

    /////*** Students Contact ***//////
    logger.info { "Student Names and Emails" }
    val studentContact =
        mapOf<String, String>("v@gmail.com" to "Vismar", "jas@gmail.com" to "Science", "Jan@gmail.com" to "Janreign")
    for (key in studentContact.keys) {
        logger.info {studentContact}


    /////***Assignments***/////

        logger.info { "Assignments: " }
        val arrayList = ArrayList<String>()
        arrayList.add("Activity 1A")
        arrayList.add("Activity 1B")
        arrayList.add("Activity 1C")
        arrayList.add("Activity 1D")
        arrayList.add("Activity 1E")
        for (i in arrayList) {
            println(arrayList)

            //// *** Student Status ***///

            var finishedAssignments: String = ""
            var assignmentMissed: String? = ""
            var absences: Int? = null
            var numberOfLate: Int? = null
            var isDropped: Boolean? = null
        }
    }
}