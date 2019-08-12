package oo

fun Int.isEven() = (this % 2 ==0)

fun City.isLarge() = population > 1000000

fun main(args : Array<String>) {

    println(5.isEven())
    val new_int = 6
    println(new_int.isEven())

    val list = (1..10).toList()
    val filteredList = list.filter { it.isEven() }.toList()
    println(filteredList)

    val city1 = City()
    city1.name = "city1"
    city1.population = 10000

    println(" is ${city1.name} large :  ${city1.isLarge()} ")


    val city2 = City()
    city2.name = "city2"
    city2.population = 10000000

    println(" is ${city2.name} large :  ${city2.isLarge()} ")


}