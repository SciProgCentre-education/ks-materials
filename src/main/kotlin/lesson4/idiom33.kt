package lesson4

/**
 * The demonstration of use of inline [forEach] function with non-local return
 */
fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // non-local return directly to the caller of foo()
        print(it)
    }
    println("this point is unreachable")
}

/**
 * Definition of inline function
 */
inline fun List<Int>.forEachOdd(block: (Int) -> Unit) = forEach {
    if (it % 2 == 1) block(it)
}


/**
 * Using inline function for type reification during the compile time
 */
inline fun <reified T: Any> List<T>.prettyPrint() = forEach {
    when (T::class) {
        Double::class -> println("Double: ${it as Double}")
        Int::class -> println("Int: ${it as Int}")
        else -> it.toString()
    }
}

/**
 * **WARNING** inline functions are an advanced feature and should be used only for reification or non-local return
 * NOT for optimization.
 */