//Create an application that will accept 2 Integers.
//It will identify the lower value and bigger value of the two inputs.
//Then, your application will print all the prime numbers starting from the lower number up to the largest number.
//Scope : String, Loops
//
//Input:
//1, 4 -> 1, 2, 3
//10 -> 1, 2, 3, 5, 7



fun main () {

    println("Enter first number: ")
    var firstNumber = readln().toIntOrNull()
    if (firstNumber == null)
        do {
            println("Please enter a valid number: ")
            firstNumber = readln().toIntOrNull()
        } while (firstNumber == null)


    println("Enter second number: ")
    var secondNumber = readln().toIntOrNull()
    if (secondNumber == null)
        do {
            println("Please enter a valid number: ")
            secondNumber = readln().toIntOrNull()
        } while (secondNumber == null)

    println("The Prime Numbers are: ")

    var low = 1
    var twoNumbers = firstNumber..secondNumber

    while (low < firstNumber) {
        if (primeNumber(low))
            print(low.toString() + " ")
        ++low
    }

    while (low < secondNumber) {
        if (primeNumber(low))
            print(low.toString() + " ")
        ++low
    }

}

fun primeNumber(num: Int): Boolean {
    var flag = true
    for (i in 2..num / 2) {
        if (num % i == 0) {
            flag = false
            break
        }
    }
    return flag
}
