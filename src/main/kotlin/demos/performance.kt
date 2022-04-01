package demos

fun function(array: DoubleArray): DoubleArray {
    return DoubleArray(array.size) { i -> array[i] + 1 }
}

fun main() {
    println(listOf(1, 2, 3).asSequence().map { it * it }.map { it + 1 }.toList())
}