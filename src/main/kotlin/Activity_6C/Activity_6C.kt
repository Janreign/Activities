////Activity 06 - C Exceptions
////
////When a customer checks out an item, identify the possible scenarios where a cart can not be checked out properly.
////
////Name at least 5 scenarios.
////
////Create a function that will check the cart for the exceptions.
////
//
//
//
//package Activity_6C
//
    class CartErrorException(message:String) : Exception(message)

    sealed class ErrorException (message:String) : Exception(message) {

        sealed class ItemExceed(message: String) : ErrorException(message) {
            class ItemTooLong(message: String = "Item Exceed") : ItemExceed(message) : InvalidLength(message)
        }
    }
//
//
//
////Possible scenarios where a cart can not be checked out properly.
//
////item exceed
////no item added
////item unavailable
////not enough balance
////no variation selected
//
//
fun main (){


    val itemsAvailable: Array<String> = arrayOf("Milk, Coffee, Shampoo, Onion, Beer, Coke, Cheese, HotDog, Pineapple Juice")
    val itemsAdded = ArrayList<String>()
    itemsAdded.add("Milk")
    itemsAdded.add("Coffee")
    itemsAdded.add("Shampoo")
    itemsAdded.add("Onion")
    itemsAdded.add("Beer")
    itemsAdded.add("Coke")




//    println(".......print ArrayList.......")
//    for (i in itemsAdded) {
//        println(i)
//    }
//
}


fun checkCart(itemsAdded: ArrayList<String>) {

    val amountBalance: Double = 150.0


    if (itemsAdded.size > 5) {
        throw CartErrorException("Item Exceed")
    }

    if (itemsAdded.size == 0) {
        throw CartErrorException("No Item Added")
    }

    if (amountBalance > 150.0) {
        throw CartErrorException("Not enough balance")
    }

}


