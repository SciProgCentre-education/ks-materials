package lesson2

class SimpleClass(val a: Int, val b: Double, c: Double)


data class DataClass(val a: Int, val b: Double){
    val c get() = b +1
}

fun main() {
    val simple = SimpleClass(1,2.0,3.0)

    println(simple)

    val data = DataClass(2, 2.0)
    val copy = data.copy(b = 22.2)
    println(copy)
}