////Using Activity 01 - B, Implement a process where someone can borrow a book.
////User: Librarian
////Goal: Keep track book borrowed, who borrowed and how long it can be borrowed.
//
////Scope :
////Data Structures
//
fun main () {

    //***Books names and how long it can be borrowed***////

    val   bookNameAndDaysLimit:HashMap<String,String> = HashMap<String,String>()
    bookNameAndDaysLimit.put("HarryPotter","10 Days")
    bookNameAndDaysLimit.put("The Bible","15 Days")
    bookNameAndDaysLimit.put("The Secret","12 days")
    println("Books list and how long it can be borrowed")
    for(key in   bookNameAndDaysLimit.keys) {
        println("Books and How long it can be borrowed: $key = ${bookNameAndDaysLimit[key]}")
    }

    println()

    println("Borrower name: ")
    val names: ArrayList<String> = ArrayList()
    while (true) {
        val enteredString = readLine()
        if (enteredString != null) {
            names.add(enteredString)

        }

            println("Book Borrowed: ")
            val bookName: ArrayList<String> = ArrayList()
            while (true) {
                val enteredString = readLine()
                if (enteredString != null) {
                    names.add(enteredString)
                }

                var result =  names + bookName
                println(result)

            }
    }
}
