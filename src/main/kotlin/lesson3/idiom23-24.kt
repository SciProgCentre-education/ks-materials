package lesson3

import java.time.Instant

class DateRange(val start: Instant, val end: Instant)

operator fun DateRange.contains(value: Instant): Boolean = value > start && value < end

fun main() {

    val emailsList = emptyList<String>()

    // When used directly infix in operator checks if the element is contained in a collection
    //using `operator fun contains`

    if ("john@example.com" in emailsList) {
        println("is in list")
    }

    if ("jane@example.com" !in emailsList) {
        println("not in list")
    }

    println(Instant.now() in DateRange(Instant.EPOCH, Instant.MAX))

    // Another (different) use of `in` is iteration over range or collection using
    // using `operator fun iterator`

    for (i in 1..100) {
        println(i)
    }  // closed range: includes 100

    (1..100).forEach { i ->
        println(i)
    } //the same, but with boxing

    for (i in 1 until 100) {
        println(i)
    } // half-open range: does not include 100
    for (x in 2..10 step 2) {
        println(x)
    }
    for (x in 10 downTo 1) {
        println(x)
    }

    infix fun ClosedRange<Double>.step(step: Double): Sequence<Double> {
        //TODO check arguments
        var current = start
        return sequence {
            do {
                yield(current)
                current += step
            } while (current <= endInclusive)
        }
    }

    for (x in 0.0..10.0 step 0.5){
        println(x)
    }
}