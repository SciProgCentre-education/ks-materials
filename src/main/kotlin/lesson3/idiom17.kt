package lesson3

class Rectangle{
    var length: Number = 0
    var breadth: Number=0
    var color: Int = 0xffffff
}

/**
 * Using apply/also to add a finalizing action
 */
fun main() {
    var i = 2

    /**
     * [also] block does not affect the result
     */
    fun getAndIncrement() = i.also { i += 1 }

    /**
     * Configure properties of an object (apply)
     * https://kotlinlang.org/docs/idioms.html#configure-properties-of-an-object-apply
     */
    val myRectangle = Rectangle().apply {
        length = 4
        breadth = 5
        color = 0xFAFAFA
    }
}