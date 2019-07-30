package basics

import java.util.Random

fun main(args: Array<String>) {

    val randomList:MutableList<Int> = mutableListOf()
    val random =  Random()

    for( i in 1..30 step 1) {
        val currentNum:Int =  (random.nextInt(100) + 1)
        randomList.add(currentNum)
    }

    for(current_num in randomList) {
       val  x = when {
           current_num < 30 -> "Number is "+ current_num + " and is lesser than 30"
           current_num > 50 -> "Number is "+ current_num + " and is greater than 50"
           else             -> "Number is "+ current_num + " and is between 30 and 50"
       }
        println(x)
    }




}