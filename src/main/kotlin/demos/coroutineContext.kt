package demos

import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.coroutineContext

//fun doSomething(){
//    coroutineContext
//}

suspend fun doSomethingSuspended(name: String) {
    println("$name : ")
    println(coroutineContext)
    println(coroutineContext[Job])
}

class MyApplication(parentContext: CoroutineContext) : CoroutineScope {
    override val coroutineContext: CoroutineContext =
        parentContext + SupervisorJob(parentContext[Job]) + CoroutineName("MyApplication")
}

fun main(): Unit {
    runBlocking {
        val myApplication = MyApplication(coroutineContext)

        myApplication.launch(Dispatchers.IO + CoroutineName("A")) {
            delay(20)
            doSomethingSuspended("A")
        }

//        val job = myApplication.launch(CoroutineName("B")) {
//            doSomethingSuspended("B")
//            error("F")
//        }

        val result = async {
            delay(20)
            22
        }

        println(result.await())
//        supervisorScope {
//            launch(CoroutineExceptionHandler { coroutineContext, throwable ->
//                println("Fail")
//            }) {
//                error("ddd")
//            }
//        }
    }

}

