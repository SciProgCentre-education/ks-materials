package lesson3

fun main() {
    val map = HashMap<String,String>()

    //The map could be accessed via indexing operation
    println(map["key"])
    map["key"] = "fff"


    /**
     * The destructuring declaration for maps and other objects that support `operator fun componentN`
     */
    for ((k, v) in map) {
        println("$k -> $v")
    }

    val (a,b) = Pair(1, 2)
}