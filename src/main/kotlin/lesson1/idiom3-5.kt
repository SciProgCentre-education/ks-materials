package lesson1

//preamble

/**
 * Functions could be defined everywhere in kotlin code. This is a so-called top-level function.
 */
fun doSomething(){
    println("I did it")
}

object AnObject{
    /**
     * This is a member-function
     */
    fun doSomethingInAnObject(){
        println("I did it in an object")
    }
}

fun doSomethingSpecial(){
    /**
     * This one is inside another function
     */
    fun doSomethingInside(){
        println("I did it inside another function")
    }
    doSomethingInside()
}

//idiom 3 - Unit
fun returnUnit(): Unit{
    // no return statement `Unit` is returned implicitly
}

//idiom 4 - default parameters
fun doSomethingWithDefault(a: Int = 0, b: String = ""): String {
    return "A string with a == $a and b == $b"
}

//idiom 5 - function body shortcut
fun theSameAsBefore(a: Int = 0, b: String = ""): String = "A string with a == $a and b == $b"