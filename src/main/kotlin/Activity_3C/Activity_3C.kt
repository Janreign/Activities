////Covered Topic(s) : Functions
////
////Instructions :
////
////1. Create an ArrayList of grocery products with 20 entries.
////2. Create a HashMap called Cart.
////Hint:  Hashmap<String, Int>
////2. Create a function "addToCart" that will accept a String and an Int, then it will add the input in the Hashmap. If the Entry already exists, create a new entry in the HashMap.
////3. Create a function "checkOut". This will compute how many items have been checked out.
////4. Create a function "removefromCart"  that will accept a String and remove the input from the Hashmap. If there are multiple entries, remove all from the HashMap.
//
//
//import mu.KotlinLogging
//
//private val logger = KotlinLogging.logger {}
//
//fun main () {
//
//    // GROCERY lIST //
//
//    logger.info { "ArrayList of Grocery Products: " }
//    val productList = ArrayList<String>()
//    productList.add("Carrot")
//    productList.add("Broccoli")
//    productList.add("Asparagus")
//    productList.add("Cauliflower")
//    productList.add("Eggplant")
//    productList.add("Refrigerator")
//    productList.add("Oven")
//    productList.add("Microwave")
//    productList.add("Toaster")
//    productList.add("Washing Machine")
//    productList.add("Canned corn")
//    productList.add("Beans")
//    productList.add("Coconut milk")
//    productList.add("Diced green chiles")
//    productList.add("Olives")
//    productList.add("Sofa")
//    productList.add("Chair")
//    productList.add("Table")
//    productList.add("Cabinet")
//    productList.add("Bed")
//
//    for (productList in productList) {
//        println(productList)
//    }
//    println()
//
//    // CART HASHMAP //
//
//    val cart:HashMap<String, Int> = HashMap<String,Int>()
//
//    println("Items in Cart: ")
//    for(key in cart.keys){
//        println("Item and amount bought: $key = ${cart[key]}")
//        println()
//    }
//    println()
//
//    addToCart()
//    checkOut()
//    removeFromCart()
//
//}
//
//
//    fun addToCart() {
//
//        val cart:HashMap<String, Int> = HashMap<String,Int>()
//        cart.put("Microwave", 3)
//        cart.put("Cabinet", 3)
//
//        println("Items added to Cart: ")
//        for(key in cart.keys){
//            println("Item and amount bought: $key = ${cart[key]}")
//        }
//
//    }
//
//    fun checkOut() {
//
//        println("Checkout Items: ")
//        println (addToCart())
//
//    }
//
//    fun removeFromCart() {
//
//            val cart:HashMap<String, Int> = HashMap<String,Int>()
//            cart.remove("Microwave", 3)
//
//            println("Items removed from Cart")
//            for(key in cart.keys){
//                println("Item and amount bought: $key = ${cart[key]}")
//                println(cart)
//            }
//    }
//
//
//
