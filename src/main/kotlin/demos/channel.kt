package demos

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.isActive
import kotlin.coroutines.CoroutineContext
import kotlin.random.Random

class ChannelDemo: CoroutineScope{
    override val coroutineContext: CoroutineContext
        get() = TODO("Not yet implemented")

    val channel = Channel<Double>()
    val channel2 = Channel<Double>()

    suspend fun produce(){
        while (isActive){
            channel.send(Random.nextDouble())
        }
    }

    suspend fun consume(){
//        while (isActive){
//            val res = channel.receive()
//            println(res)
//        }
        for(res in channel){
            println(res)
            channel2.send(res)
        }
    }

}