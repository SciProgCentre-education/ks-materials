package demos

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlin.random.Random

suspend fun main() {
    coroutineScope {
        val f = flow {
            while (true) {
                val value = Random.nextDouble()
                delay(10)
                println("Emitted $value!")
                emit(value)
            }
        }

        val res = f
            .map { it + 1 }
            .flatMapConcat {
                flow {
                    emit(it)
                    emit(it+1)
                }
            }.onEach {
                delay(20)
                println("Collected $it!")
            }.launchIn(this)

        delay(500)
        res.cancel()

        val f2 = channelFlow<Int> {
            repeat(10){
                val value = Random.nextInt()
                println("Hot int: $value")
                send(value)
            }
        }

        f2.take(1).collect {

        }

        val sharedFlow = MutableSharedFlow<Double>()
        sharedFlow.emit(2.0)
    }
}