package lesson3

object AClass{
    val a = "a"
    val b = "b"
    val c = "c"
}

/**
 * [with]/[run]/[let] are used to create a scope with given argument or receiver
 */
fun main() {
    // Simple print of AClass
    println("a = ${AClass.a}, b= ${AClass.b}, c = ${AClass.c}")

    // Using `with`
    with(AClass){
        // AClass type is the receiver in this scope
        println("a = $a, b= $b, c = $c")
        return@with "some value"
    }

    //using `run`
    AClass.run {
        // the same as above
        println("a = $a, b= $b, c = $c")
    }

    //Using `let` to compose result. Not recommended to use without a need
    val letResult = AClass.let {
        it.c + it.a
    }
}