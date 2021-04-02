package lesson3

class AClassWithList{
    private val _list = ArrayList<Int>()
    val list: List<Int> get() = _list
}

fun main() {
    val obj = AClassWithList()
    obj.list
}