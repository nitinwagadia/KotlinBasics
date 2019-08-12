package oo

class Country(name: String, area: Int) {

    val name:String = name
    val area:Int    =  area

    fun print() = "Java type constructor Constructor : =>  $name , $area "
}

class Country1(name: String, area: Int) {

    val name:String
    val area:Int
    init {
        this.name =  name
        this.area =  area
    }

    fun print() = "Kotlin Constructor type 1 =>  $name , $area "
}

class Country2(val name: String, val area: Int) {

    constructor(name: String) :this(name, 0)
    fun print() = "Kotlin Constructor type 2 =>  $name , $area "
}


fun main() {
    val constructor1 = Country("USA", 500000)
    println(constructor1.print());
    val kotlinConstructor =  Country1(name = "USA", area = 500000)
    println(kotlinConstructor.print())
    val kotlinContructor2 =  Country2("USA", 5000000)
    println(kotlinContructor2.print())
    val secondaryConstructor =  Country2("Unknown")
    println(secondaryConstructor.print())
}