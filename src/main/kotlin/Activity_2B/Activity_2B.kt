////Implement Activity 01 -  B using data structure.
////You are tasked to automate a school’s library
////List of Five Items you can borrow in a Library
////Use data structure
//
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

fun main () {


                 ///*** Books ***///

    logger.info {"Books and Book number in Library"}
    val books = mapOf<String, Int>( "In Search of Lost Time by Marcel Proust" to 12, "Don Quixote by Miguel de Cervantes" to 18, "One Hundred Years of Solitude by Gabriel Garcia Marquez" to 24, "The Great Gatsby by F. Scott Fitzgerald" to 31, "War and Peace by Leo Tolstoy" to 16
    )
    for (key in books.keys) {
        println(books[key])
    }

                ///***Country Maps***///

    logger.info { "Country Maps: " }
    var countryMaps: List<String> = mutableListOf<String>("Map of USA", "Mao if Japan", "Map of Philippines", "Map of Mexico")
    var country = countryMaps as ArrayList
    countryMaps.add("Map of Singapore")
    countryMaps.add("Map if China")
    countryMaps.add("Map of Russsia")
    countryMaps.sort()
    countryMaps.remove("Map of USA")

    logger.info {countryMaps}


               ///*** Musical Instruments ***///

    logger.info { "Musical Instruments: " }
    var musicalInstruments: List<String> = mutableListOf<String>("Guitar", "Keyboard", "Flute", "Bass Guitar", "Violin")
    var instrument = musicalInstruments as ArrayList
    musicalInstruments.add("Clarinet")
    musicalInstruments.add("Ukelele")
    musicalInstruments.sort()
    musicalInstruments.remove("Bass Guitar")
    logger.info {musicalInstruments}


             ///*** Artworks ***///

    logger.info { "Artwork: " }
    var artWorks: List<String> = mutableListOf<String>("Mona Lisa", "The Last Supper", "The Starry Night", "The Scream", "The Birth of Venus")
    var art = artWorks as ArrayList
    artWorks.add("Girl With a Pearl Earring")
    artWorks.add("The Kiss")
    artWorks.sort()
    artWorks.remove("The Scream")
    logger.info {artWorks}


           ///*** VCD/DVD***///

    logger.info { "VCD/DVD: " }
    var vcdAnddvd: List<String> = mutableListOf<String>("A Space Odyssey (1968)", "The Godfather (1972)", "Avatar", "Titanic", "Avengers: Endgame")
    var vcddvd = vcdAnddvd as ArrayList
    vcdAnddvd.add("Spider Man")
    vcdAnddvd.add("Star Wars: Episode VII")
    vcdAnddvd.sort()
    vcdAnddvd.remove("Avengers: Endgame")
    logger.info {vcdAnddvd}


}
