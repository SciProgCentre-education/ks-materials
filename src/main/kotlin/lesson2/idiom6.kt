package lesson2

//Interfaces and objects

interface AnInterface {
    val a: Int get() = 4
    fun doSomething()
}

class AClass(override val a: Int) : AnInterface {
    override fun doSomething() = TODO()
}

/**
 * A singleton (object) is a type (class) which have only one instance
 */
object AnObject : AnInterface {
    override fun doSomething(): Unit = TODO("Not yet implemented")
}

fun main() {
    /**
     * Creating an instance
     */
    val instance = AClass(3)

    /**
     * Using singleton reference without constructor invocation
     */
    val obj: AnInterface = AnObject

    /**
     * Anonymous object
     */
    val anonymous = object : AnInterface {
        override fun doSomething(): Unit = TODO("Not yet implemented")
    }

    /**
     * The one that should not be named
     */
    val voldemort = object {
        fun doSomething(): Unit = TODO()
    }

    voldemort.doSomething()
}