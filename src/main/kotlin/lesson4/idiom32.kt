package lesson4

class ClassWithALazyProperty{
    //Use lazy delegate for something that should be calculated ones on first call
    val lazyValue by lazy {
        //Do dome heavy logic here
        22
    }
}

//Using other delegates
fun main() {
    val map = mapOf("a" to 1, "b" to 2)

    val a by map

    println(a)
}