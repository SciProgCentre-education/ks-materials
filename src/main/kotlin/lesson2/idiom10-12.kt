package lesson2

import java.io.File

/**
 * idiom 10
 * Nullable truth.
 */
fun idiom10() {
    class A(val b: Boolean?)

    val a: A? = A(null)
    //use
    a?.b == true
    //instead of
    a?.b ?: false

    // The old way
    val res = if (a == null) {
        false
    } else {
        if (a.b == null) {
            false
        } else {
            a.b
        }
    }
}

/**
 * Dart-like (?=) nullable assignment
 */
fun idiom11() {
    var x: String? = null
    x = x ?: "Hello"
}

/**
 * Safe call and elvis operator
 */
fun idiom12() {
    val files = File("Test").listFiles()
    println(files?.size ?: "empty")
}
