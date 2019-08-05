package basics

fun main(args: Array<String>) {

    //lambda with inferred input and output parameter
    val timesTwo  = { x:Int -> x*2 }

    //lambda with input and output parameter
    val addNumber: (Int, Int) -> (Int)= { x: Int , y: Int -> x+ y}

    println(" two times five is : " + timesTwo(5))
    println(" Sum of 2 and 5 is : "+ addNumber(2,5))

    //Higher order function
    val list = (1..100).toList()
    val greaterThan40 = list.filter({ x:Int -> x > 40 })
    println(greaterThan40)

    println("Using it variable , > 50 ")
    //Using 'it' variable
    println(list.filter { it > 50 })

    // Using function pointers as lambdas
    println("Function pointers as lambdas, > 60")
    println(list.filter(::isGreaterThan60))



}

fun isGreaterThan60(currentElement: Int) = currentElement > 60