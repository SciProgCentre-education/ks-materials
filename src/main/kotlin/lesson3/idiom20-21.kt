package lesson3

fun main() {
    val map = mutableMapOf(
        "key" to "a",
        "key2" to "b",
    )

    //The map could be accessed via indexing operation
    println(map["key"])
    map["key"] = "fff"


    //val entry: MutableMap.MutableEntry<String, String> = map.iterator().next()

    /**
     * The destructuring declaration for maps and other objects that support `operator fun componentN`
     */
    for ((k, v) in map) {
        //val (k, v) = entry
//        val k = entry.component1()
//        val v = entry.component2()
        println("$k -> $v")
    }

    map.forEach { (k, v) -> println("$k -> $v")}

    val (a, b) = Pair(1, 2)

    val coord = doubleArrayOf(0.0, 1.0, 2.0)

    val (x,y,z) = coord

    data class Coordinate(val x: Double, val y: Int)

    val (x1, y1) = Coordinate(1.0,2)
}