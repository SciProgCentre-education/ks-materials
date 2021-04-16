package lesson4

import kotlin.random.Random

//TODO move to beginning of the course
fun main() {
    val b = Random.nextBoolean()
    // assign value to an expression
    val a = if (b) 0 else 1 // b ? 0 : 1

    //Use Try/catch as an exception
    val result = try {
        "22a".toInt()
    } catch (e: NumberFormatException) {
        null //Strongly discouraged in performance-critical code
    }
    println(result)

}