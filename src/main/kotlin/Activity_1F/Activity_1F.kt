import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

//Create an application that will accept 2 string inputs.
//Your application will print all unique characters in both Strings.
//

//Scope :
//String
//Loops


fun main(args: Array<String>) {

    println("Enter String 1: ")
    var str = readln()
    var result1 = str.toSet()

    println("Enter String 2: ")
    var str2 = readln()
    var result2 = str2.toSet()

    println(result1+result2)

}

