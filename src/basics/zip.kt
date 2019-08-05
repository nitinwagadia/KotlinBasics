package basics

fun main(args: Array<String>) {

    val list = listOf("Hi", "there", "KoTlin", "programmer")
    val containsT = listOf(false, true, true, false)

    val zipped : List<Pair<String, Boolean>> = list.zip(containsT)
    println("Zipped List")
    println(zipped)

    val elementContainT =  list.map { it.contains ("t", true) }

    val zippedList = list.zip(elementContainT)
    println(" Contains T/t ?")
    println(zippedList)
}