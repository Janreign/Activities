import javax.swing.text.Element
//Activity 1_J

//Using Activity 01 - C
//
//Implement a process where items are added to the grocery cart.
//
//User : Cashier
//
//Goal : List of Items bought, how many items were bought and total cost.
//
//Scope :
//Data Structures
//
//Identify the items that can be bought in a grocery store.
//
//Hint: Hashmap ang gagamitin,

//
//
fun main () {

    val items = hashMapOf("Soap" to 10.0, "Shampoo" to 20.0, "Cheese" to 30.0)
    val totalCost = items.values.sum()
    val totalItems = items.count()

    println("List of Items bought ${items.keys}")
    println("Total number of items: $totalItems")
    println("Total cost: $totalCost")

}

