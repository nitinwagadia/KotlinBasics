package oo

class City
{
    var name:String = ""
        // Implicitly defining getters and setters
         get() = field
         set(value) {
             field = value
         }
    var population:Int = 0
}

fun main() {
    val berlin = City()
    berlin.name = "Berlin"
    berlin.population = 3500000

    println("name :  ${berlin.name}")
    println("population : ${berlin.population}")
}