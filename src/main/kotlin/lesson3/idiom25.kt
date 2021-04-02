package lesson3

import kotlin.math.PI
import kotlin.math.sin

fun main() {
    fun integrate(
        from: Double = 0.0,
        to: Double = 1.0,
        step: Double = 0.01,
        function: (Double) -> Double,
    ): Double {
        require(to > from)
        require(step > 0)
        var sum = 0.0
        var pos = from
        while (pos < to) {
            sum += function(pos)
            pos += step
        }
        return sum
    }

    integrate { x ->
        x * x + 2 * x + 1
    }
    integrate(0.0, PI) { sin(it) }
    integrate(0.0, PI, step = 0.02) { sin(it) }
}