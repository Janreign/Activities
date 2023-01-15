Covered Topic(s) : OOP

//1. Create a parent class for all the products in the grocery.
//2. Create a cart to store the groceries.
//3. Create a Main class where you will add the Cart.
//4. In the main class add the following functions
//a - add to cart > add an item in the cart
//b - remove from cart > remove item in the cart
//c - check out cart > compute the total cost of the cart.


open class Products{

    fun addToCart (){

    }

    fun removeFromCart () {

    }

    fun checkOutCart (){

    }

}


open class CartForStoring {


    fun addItem() {

        var items = ArrayList<String>()
        items.add("Fish")
        items.add("Corned Beef")

        println("This will show how many names are on the list: ")
        println(items.size)

    }
}

open class Carts: CartForStoring () {}







