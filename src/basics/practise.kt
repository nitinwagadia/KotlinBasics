package basics

fun main() {

    val data = mapOf(
        "users1.csv" to listOf(32, 45, 17, -1, 34),
        "users2.csv" to listOf(19, -1, 67, 22),
        "users3.csv" to listOf(),
        "users4.csv" to listOf(56, 32, 18, 44)
    )


    val averageAge = data.map { (_, list) -> list.filter { it >=0 }.average() }
    println("Average Age : ")
    println(averageAge)

    val faultyFileNames = data.filter { it -> it.value.any { it < 0 }}.map { it.key }

    println("Faulty fileNames : ")
    println(faultyFileNames)

    val faultyDataPoints =  data.flatMap { it.value }.filter { it < 0 }.count()

    println("Faulty data points :  ${faultyDataPoints} ")



}