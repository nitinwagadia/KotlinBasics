package basics

fun main() {

    val list = (1..1000).toList()

    val first10 = list.take(10)
    println("First 10 elements")
    println(first10)

    println("dropping first 10")
    val dropFirst10 = list.drop(10)
    println(dropFirst10)

    val sequence =  generateSequence(100, { it + 10 })

    val Seqfirst10 = sequence.take(10).toList()
    println("First 10 elements of sequence")
    println(Seqfirst10)

}