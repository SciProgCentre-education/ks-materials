package demos

fun main() {
    val array = doubleArrayOf(1.0, 2.0, 3.0)
    val b: Double? = 1.0
    val newArray: DoubleArray = DoubleArray(array.size) {
        array[it] + (b  ?: 0.0)
    }
}