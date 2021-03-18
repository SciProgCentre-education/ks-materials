package lesson2

//Interfaces and objects

interface AnInterface {
    fun doSomething()
}

class AClass : AnInterface {
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
    val instance = AClass()

    /**
     * Using singleton reference without constructor invokation
     */
    val obj = AnObject

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
}