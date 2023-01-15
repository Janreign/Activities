//Activity 06 - A Exceptions
//
//Using Activity 05 A
//Create a function that will check the student's grade.
//The function will accept an array with 10 entries only. It will throw the following exceptions
//:if the array size is greater than 10 throw invalid input
//:if the array contains 0 throw incomplete grades

package Activity_6A

import custom.CellNumberException

class StudentGradeException (message:String) : Exception(message)

sealed class GradeException (message:String) : Exception(message) {
    sealed class InvalidLength(message: String) : GradeException(message) {
        class GradeExceeds(message: String = "Grade Exceeds") : InvalidLength(message)
        class ContainsZero(message: String = "Incomplete grades") : InvalidLength(message)
    }

    fun main() {

        val studentGrade = arrayOf(90, 85, 75, 78, 92, 87, 88, 89, 91, 0)

        try {
            checkStudentGrade(studentGrade)
        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

fun checkStudentGrade(studentGrade: Array<Int>) {
        if (studentGrade.size > 10) {
            throw GradeException.InvalidLength.GradeExceeds()
        }
    }

fun checkIfContainsZero(studentGrade: Array<Int>) {
        if (studentGrade.contains(0)) {
            throw GradeException.InvalidLength.ContainsZero()
        }
    }
}
//
//////////////////////////
class CellNumberException(message:String) : Exception(message)

sealed class MobileNumberException (message:String) : Exception(message) {

    sealed class InvalidLength(message: String) : MobileNumberException(message) {
        class MobileNumberTooShort(message: String = "Length is Short") : InvalidLength(message)
        class MobileNumberTooLong(message: String = "Length is Short") : InvalidLength(message)
    }

    class ContainsCharacters(message: String = "Length is Long") : MobileNumberException(message)

    sealed class UnknownProvider(message: String) : MobileNumberException(message) {
        class NotGlobeProvider(message: String) : UnknownProvider(message)
        class NotSmartProvider(message: String) : UnknownProvider(message)
        class NotTouchMobileProvider(message: String) : UnknownProvider(message)
        class NotTalknTextProvider(message: String) : UnknownProvider(message)
    }

    fun main() {

        var cellNumber = "1111222333a"

        try {
            checkCellNumber(cellNumber)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun checkCellNumber(cellNumber: String) {
        if (cellNumber.length > 11) {
            throw MobileNumberException.InvalidLength.MobileNumberTooLong()
        }

        if (cellNumber.length < 11) {
            throw MobileNumberException.InvalidLength.MobileNumberTooShort()
        }

        if (!isNumeric(cellNumber)) {
            throw CellNumberException("Contains Alphabets")
        }
    }

    fun checkMobileNumber(cellNumber: String) {
        if (cellNumber.length != 11) {
            throw CellNumberException("Invalid Length")
        }

        if (!isNumeric(cellNumber)) {
            throw CellNumberException("Contains Alphabets")
        }
    }

    fun isNumeric(toCheck: String): Boolean {
        return toCheck.all { char -> char.isDigit() }
    }

    fun checkMobileNumberv2(cellNumber: String) =
        try {
            true

            try {
                throw CellNumberException("Invalid Length")
            } catch (e: Exception) {

            }
        } catch (e: Exception) {
            false
        }
}