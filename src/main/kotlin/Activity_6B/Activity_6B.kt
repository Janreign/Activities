////Activity 06 - B Exceptions
////
////Create a function that will accept an item in the library and a person who will borrow the item, (Use classes in Activity 05 - B).
////
////Throw the following exceptions :
////
////if the user still has 5 or more items from the library - Cannot borrow due to too many items still borrowed
////if the user has unpaid dues - Cannot borrow Exception due to unpaid dues
////if the item being borrowed has been reserved - Cannot borrow due to reserved
////it the item is for internal use - Cannot borrow due to item only used in library
////if the item is for fixing - Cannot borrow due to item needs to be fixed
////
////You will need to add the remaining classes and add the remaining methods and attributes in order to implement the functionalities.
//
//package Activity_6B
//
class borrowerException(message:String) : Exception(message)

    sealed class userException (message:String) : Exception(message) {
    sealed class InvalidSize(message: String) : userException(message) {
        class SizeTooMany(message: String = "Cannot borrow due to too many items still borrowed") : InvalidSize(message)

    }

    fun main() {

        val borrowedItem = ArrayList<String>(5)
        borrowedItem.add("Ajay")
        borrowedItem.add("Vijay")
        borrowedItem.add("Prakash")
        borrowedItem.add("Rohan")
        borrowedItem.add("Vijay")

        var user = ""


        try {
            checkBorrowedItem(borrowedItem)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun checkBorrowedItem(borrowedItem: ArrayList<String>) {

        if (borrowedItem.size >= 5) {
            throw borrowerException("Cannot borrow due to too many items still borrowed")
        }

        if (user has unpaid dues) {
            throw borrowerException("Cannot borrow Exception due to unpaid dues")
        }

        if (borrowedItem = reserved){

            throw borrowerException("Cannot borrow due to reserved")
        }

        if (borrowedItem = internalUse){

            throw borrowerException("Cannot borrow due to item only used in library")
        }

        if (borrowedItem = forFixing){

            throw borrowerException("Cannot borrow due to item only used in library")
        }


//            - Cannot borrow Exception due to unpaid dues
//        if the item being borrowed has been reserved - Cannot borrow due to reserved
//        if the item is for internal use - Cannot borrow due to item only used in library
//        if the item is for fixing - Cannot borrow due to item needs to be fixed

    }



}
//
//fun borrower(){}
//
//if (borrowedItem => 5)
//
//    Cannot borrow due to too many items still borrowed

//class Magazine(){}
//class Newspaper(){}
//class Comics(){}
