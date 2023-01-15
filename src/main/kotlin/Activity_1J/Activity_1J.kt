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

    println("Items bought")
    val itemsBought: MutableMap<String,Double> = mutableMapOf("Milk" to 10.5, "Shampoo" to 5.5, "" to 15.5)
    val additionalItems: Map<String,Double> = mapOf("Milk" to 10.5, "Shampoo" to 5.5)
    additionalItems.forEach { (k, v) -> if (itemsBought.containsKey(k)) itemsBought.merge(k, v, Double::plus) }
    val mergeItems = (itemsBought.toList() + additionalItems.toList())

    println("Total: $mergeItems")

}

