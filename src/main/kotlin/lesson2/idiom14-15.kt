package lesson2

/**
 * Extension property on a String. It is not monkey-patching.
 */
fun String.countOs(): Int = count { it == 'о' } // implicit this points to String

fun main() {
    fun Int.printMe() = println(this) // explicit this

    "вылысыпыдыстычка".countOs().printMe()
    
//    listOf(1, 2, 3).odd
//    listOf(1, 2.0, 3).odd
}

//fun doSmth(){
//    "вылысыпыдыстычка".countOs().printMe()
//}

/**
 * Extension property (must be virtual)
 */
val List<Int>.odd get() = filter { it % 2 == 1 }

/**
 * Extension variable (also must be virtual)
 */
var Array<Int>.second: Int
    get() = get(1)
    set(value) {
        set(1, value)
    }