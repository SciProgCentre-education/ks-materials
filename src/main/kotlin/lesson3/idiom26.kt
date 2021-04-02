package lesson3

fun main() {
    val list: List<Int> = listOf(1, 2, 3, 4, 5, 6)

    val result = list
        .filter { it % 2 == 0 } //select even numbers
        .map { it * it } // get square of each element
        .sumByDouble { it.toDouble() } //use one of reduce operations

    println(result)
}