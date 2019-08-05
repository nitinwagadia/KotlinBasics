package basics

fun main(args: Array<String>) {

    // kotlin list map()
    val list = (1..100).toList()
    val doubled_list = list.map { element -> element*2 }
    println("Doubled Value :")
    println(doubled_list)

    val averageVal = list.average()
    val shifted = list.map { current_element -> current_element - averageVal }
    println("Shifted List ")
    println(shifted)

    // flat map
    val nestedList = listOf(
        (1..10).toList(),
        (11..20).toList(),
        (21..30).toList()
    )

    println("Nested List ")
    println(nestedList)

    println("Sorted Descending nestedList")
    val sortedList = nestedList.map { currentList:List<Int> -> currentList.sortedDescending() }
    println(sortedList)

    println("Sorted Descending flatList")
    val flattenedSortedList = nestedList.flatMap { it.sortedDescending() }
    println(flattenedSortedList)

}