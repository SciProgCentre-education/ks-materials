package lesson4

interface Factory<T : Any> {
    fun build(str: String): T
}


class IntContainer(val arg: Int) {
    companion object : Factory<IntContainer> {
        override fun build(str: String) = IntContainer(str.toInt())
    }
}

class DoubleContainer(val arg: Double) {
    companion object : Factory<DoubleContainer> {
        override fun build(str: String) = DoubleContainer(str.toDouble())
    }
}

fun <T : Any> buildContainer(str: String, factory: Factory<T>): T = factory.build(str)

fun main() {
    buildContainer("22", IntContainer)
}