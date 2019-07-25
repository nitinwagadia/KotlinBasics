package basics

import java.io.IOException

fun main(args: Array<String>) {


    /* try catch is expression in kotlin :) */
    val result = try {
        getException()
    }
    catch (e: IOException) {
        e.printStackTrace()
        ""
    }
    finally {
        println("In finally block")
    }

    println("**********************")
    print(result)

}

fun getException() : String  {
    throw IOException(" meh this is some boring exception test")
}