package demos

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun doASuspendedThing() {
    delay(500)
}

suspend fun doASuspendedThingWithResult(): Int {
    delay(500)
    return 4
}

suspend fun main() {
    //sequential coroutine
    GlobalScope.launch {
        doASuspendedThingWithResult()
        // do a thing and do next thing when the result is there without blocking
        doASuspendedThing()
    }

    //parallel coroutines
    GlobalScope.launch(Dispatchers.Default) {
        val job1 = launch {
            doASuspendedThing()
        }
        val job2 = launch {
            doASuspendedThing()
        }
        job1.join()
        job2.join()
    }
}