package lesson1

/**
 * `val` means read-only property
 *
 * `var` means writeable property
 *
 * Unnecessary use of `var` is not recommended.
 *
 * **NOTE:** In performance critical cases explicit cycles are better, but mutable state should be encapsulated.
 */
fun main() {
    /* Not recommended */
    var counter = 0
    for(i in 0..20){
        counter += i
    }

    /* recommended */
    val sum = (0..20).sum()
}