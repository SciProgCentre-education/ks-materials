package demos

import java.io.IOException

fun main() {
    try {
        val b: Nothing = throw RuntimeException("Oops")
    } catch (t: IOException){
        println(t.message + "_io")
    } catch (t: RuntimeException){
        println(t.message)
    } finally {
        println("caught")
    }
}