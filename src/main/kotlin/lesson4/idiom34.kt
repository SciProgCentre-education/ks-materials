package lesson4

/**
 * Values are boxed. Each call is indirect
 */
val list: List<Double> = List(20) { it.toDouble() }

/**
 * Still boxed
 */
val genericArray: Array<Double> = Array(20) { it.toDouble() }

/**
 * Non-boxed
 */
val specializedArray: DoubleArray = DoubleArray(20) { it.toDouble() }