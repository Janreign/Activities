//Implement Activity 01 - C using data structure.

//pork, fish, crab, butter, cheese, chicken


//Poultry
//
//Fish
//
//Canned goods
//
//Snacks
//
//Frozen Products
//
//Fruits
//
//Vegetables
//
//Condiments
//
//Furniture
//
//Appliances
//
//Clothes
//Pet
//
//Sanitary Products
//
//Personal Care

import mu.KotlinLogging

private val logger = KotlinLogging.logger {}


fun main () {


    ///*** Fish ***///

    logger.info { "Fish: " }
    var listOfFish: List<String> = mutableListOf<String>("Tuna", "Salmon", "Tilapia", "Sardines", "Alaskan salmon")
    var fish = listOfFish as ArrayList
    listOfFish.add("Bangus")
    listOfFish.sort()
    logger.info {listOfFish}



    ///*** Vegetables ***///

    logger.info { "Vegetables: " }
    var listOfVegetables: List<String> = mutableListOf<String>("Carrot", "Broccoli", "Asparagus", "Cauliflower", "Eeggplant")
    var vegetables = listOfVegetables as ArrayList
    listOfVegetables.add("Lettuce")
    listOfVegetables.sort()
    logger.info {listOfVegetables}



    ///*** Appliances ***///

    logger.info { "Appliances: " }
    var listOfAppliances: List<String> = mutableListOf<String>("Refrigerator", "Oven", "Microwave", "Toaster", "Washing Machine")
    var appliances = listOfAppliances as ArrayList
    listOfFish.add("Coffee Maker")
    listOfFish.sort()
    logger.info {listOfAppliances}



    ///*** Canned goods ***///

    logger.info { "Canned Goods: " }
    var listOfCannedGoods: List<String> = mutableListOf<String>("Canned corn", "Beans", "Coconut milk", "Diced green chiles", "Olives")
    var cannedGoods = listOfCannedGoods as ArrayList
    listOfFish.add("Baby corn")
    listOfFish.sort()
    logger.info {listOfCannedGoods}



    ///*** Furniture ***///

    logger.info { "Furniture: " }
    var listOfFurnitures: List<String> = mutableListOf<String>("Sofa", "Chair", "Table", "Cabinet", "Bed")
    var furniture = listOfFurnitures as ArrayList
    listOfFish.add("Dresser")
    listOfFish.sort()
    logger.info {listOfFurnitures}


}