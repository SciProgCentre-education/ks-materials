package demos

import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.sin

fun integrate(range: ClosedRange<Double>, nPoints: Int = 100, f: (Double) -> Double): Double {
    val points = DoubleArray(nPoints) { i ->
        range.start + i * (range.endInclusive - range.start) / (nPoints - 1)
    }

    return points.sumOf { f(it) } * (range.endInclusive - range.start) / nPoints
}

fun ((Double) -> Double).integrate(
    range: ClosedRange<Double>,
    nPoints: Int = 100,
): Double = integrate(range, nPoints, this)

fun main() {
    val res = integrate(0.0..PI, 500) { x -> sin(x) + cos(x) * x.pow(2) }
    println(res)

    val f = { x: Double -> sin(x) + cos(x) * x.pow(2) }

    val res2 = f.integrate(0.0..PI)
}