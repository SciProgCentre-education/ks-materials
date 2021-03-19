package lesson2

/**
 * Matching by type
 */
fun checkType(arg: Any) = when(arg){
    is String -> println("I am a String")
    is Int -> println("I am an Int")
    is Double -> println("I am a Double")
    else -> println("I don't know who am I?")
}

fun main() {
    checkType(true)
}