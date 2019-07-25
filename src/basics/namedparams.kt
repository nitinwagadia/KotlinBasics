package basics

import java.io.File.separator

fun main(){

    val listofString = listOf<String>("Item1", "Item2", "Item3")
    val commaSeparatedString: String = concat(listofString)
    println("==== COMMA SEPARATED STRING ====")
    println(commaSeparatedString)

    println("... COLON SEPARATED STRING ...")
    val colonSeparatedString: String =  concat(listofString, ":")
    println(colonSeparatedString)

    println("... Switching parameter orders ...")
    val dashSeparatedString: String =  concat(separator =  "-", texts = listofString)
    println(dashSeparatedString)


}

fun concat(texts: List<String>, separator: String=",") : String
{
   return texts.joinToString(separator)
}