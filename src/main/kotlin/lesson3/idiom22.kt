package lesson3

class AClassWithList{
    var b: Double = 2.0
        private set

    private val _list = ArrayList<Int>()
    val list: List<Int> get() = _list
}

fun main() {
    val obj = AClassWithList()
    obj.list
}