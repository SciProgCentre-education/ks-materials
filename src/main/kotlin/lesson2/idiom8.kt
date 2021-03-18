package lesson2

class SimpleClass(val a: Int, val b: Double)


data class DataClass(val a: Int, val b: Double)

fun main() {
    val data = DataClass(2, 2.0)
    val copy = data.copy(b = 22.2)
    println(copy)
}