package lesson3

fun main() {
    val list: List<Int> = listOf(1, 2, 3, 4, 5, 6)

    val result = list
        .filter { it % 2 == 0 } //select even numbers
        .map { it * it } // get square of each element
        //.onEach { println(it) }
        //.sumOf { it } //use one of reduce operations
        .reduce { acc, i -> acc + i }

    println(result)
}