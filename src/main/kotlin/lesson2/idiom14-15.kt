package lesson2

fun String.countOs(): Int = count { it == 'о' } // implicit this points to String

fun Int.printMe() = println(this) // explicit this

fun main() {
    "обороноспособность".countOs().printMe()
}