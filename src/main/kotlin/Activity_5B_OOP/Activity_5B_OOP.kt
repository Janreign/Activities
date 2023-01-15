//////Covered Topic(s) : OOP
//////
//////1. A book, a magazine, a newspaper and comics inherits from a Publication class. Identify the attributes and the methods for the publication.
//////2. There are several Audio / Video materials, Recordings, Documentary, Movies, and a PowerPoint materials.
//////What will you use to present the different types of Audio / Video presentation, a class or an enum? Why?
//////Implement your answer in code.  (MY NOTE:   I use CLASS because ENUM constants are public, static, and final/ unchangeable - cannot be overridden)
//////3. Authors and Illustrators seem to have similar data? What will you use to present the two a class or an enum or will you keep them as is? Why?
//////Implement your answer in code.
////
////
open class Publication {

    var author: String = ""
    var illustrator: String = ""
    var publisher: String = ""
    var yearPublished: Int = 0
    var cityOfPublication: String = ""
    var countryStateOfPublication: String = ""

    fun published (){}
    fun printed(){}
    fun publishedOnline(){}
    fun inProduction (){}

}

class Magazine : Publication (){}

class Newspaper: Publication (){}

class Comics: Publication  (){

}

open class VideoMaterials{}
class Recordings{}
class Documentary{}
class Movies{}
class PowerPoint {}



//
//
//
