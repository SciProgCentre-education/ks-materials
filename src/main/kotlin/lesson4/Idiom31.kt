package lesson4

class Bad{
    val value: Int

    init {
        value = requestValue()
    }

    private fun requestValue(): Int = TODO()
}


//Factory functions are preferred to the initialization logic

class Good internal constructor(val value: Int){
    init {
        //Initialization block is there to check arguments
        require(value >= 0)
    }

    companion object
}

private fun requestValue(): Int = TODO()

// This is the factory-function
fun Good() = Good(requestValue())


// additional constructor-like builders could be added to the companion

@OptIn(ExperimentalUnsignedTypes::class)
fun Good.Companion.build(value: UInt) = Good(value.toInt())