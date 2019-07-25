fun main_bas()
{
    println("Hello world")
    var variable: Int =  5
    var newString = "Hey this is sttrng"
    println("String value is : "+ newString)
    println("value of variable is  : "+ variable)
    variable = 15;
    println("value of variable is  : "+ variable)
    var c:Char = 'a'
    val s:Short =5;

    var str:String = when(s) {
        in 1..20 ->  {

            println(" 1 + 5 == " + (1+5))

            "between 1 .. 20"
        }
        !in 1..20 -> "not between 1 .. 20"
        else -> "meh else block"
    }

    println("Result is  : $str")


}