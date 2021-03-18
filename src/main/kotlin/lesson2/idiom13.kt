package lesson2

fun printNotNull(any: Any) = println(any)

fun main(){
    var value: Int? = 2

    if(value != null){
        //not guaranteed to work with mutable variable
        printNotNull(value)
    }

    value?.let {
        printNotNull(it) // execute this block if not null
        printNotNull(value) // value is not null here
    }
}