package lesson4

@OptIn(ExperimentalStdlibApi::class)
fun main() {
    //Consume mutating lambda
    val list = buildList {
        repeat(10){
            add(it)
        }
    }
}