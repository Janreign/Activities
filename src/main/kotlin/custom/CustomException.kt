//package custom
//
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

    if(!isNumeric(cellNumber)){
        throw CellNumberException("Contains Alphabets")
    }
}

fun checkMobileNumber(cellNumber:String) {
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

fun checkMobileNumberv2(cellNumber:String) =
    try {
        true

        try {
            throw CellNumberException("Invalid Length")
        } catch (e: Exception) {

        }
    }catch (e:Exception){
        false
    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
