
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

//package Activity_2D
//
//class Activity_2D {



//Implement Activity 01 - D using data structure.

////Create an application that will accept 5 monetary amounts.
////After the input is done, the user will be asked “Divide the value by how many?”. It will only accept an Integer as input.
////The total of the 5 input will be divided by the answer in the second question input.
////Note: Error checking must be done.


///*** 5 monetary amounts***///


fun main () {

    logger.info { "Monetary Amounts: " }

    var monetaryAmounts: Array<Double> = arrayOf(
        15.5,
        17.5,
        15.15,
        14.50,
        16.50,
    )

    val myDividend = monetaryAmounts.sum()
    val quotient = myDividend / 5

    logger.info {quotient}
}




