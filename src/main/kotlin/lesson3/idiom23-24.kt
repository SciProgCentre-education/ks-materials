package lesson3

fun main() {

    val emailsList = emptyList<String>()

    // When used directly infix in operator checks if the element is contained in a collection
    //using `operator fun contains`

    if ("john@example.com" in emailsList) {
        println("is in list")
    }

    if ("jane@example.com" !in emailsList) {
        println("not in list")
    }

    // Another (different) use of `in` is iteration over range or collection using
    // using `operator fun iterator`

    for (i in 1..100) { println(i) }  // closed range: includes 100
    for (i in 1 until 100) { println(i) } // half-open range: does not include 100
    for (x in 2..10 step 2) { println(x) }
    for (x in 10 downTo 1) { println(x) }
}