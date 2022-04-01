package lesson2

fun printNotNull(any: Any) = println(any)

val value: Int? = 2
//val value: Int? by lazy{ 2 }

fun main() {
    //printNotNull(value) // Error
    if (value != null) {
        //not guaranteed to work with mutable variable
        printNotNull(value)
    }

    // Safe call here
    value?.let {
        printNotNull(it) // execute this block if not null
        printNotNull(value) // value is not null here
    }
}