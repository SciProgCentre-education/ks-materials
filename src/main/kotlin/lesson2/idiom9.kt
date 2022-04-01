package lesson2

import lesson1.returnUnit

/**
 * The declaration if valid because [TODO] returns Nothing
 */
fun getSomething(): Int? = TODO()

fun findSomething(): Int {
    // early return is valid because `return` operator result is Nothing
    val found = getSomething() ?: return 2
    return found + 2
}

fun checkCondition(): Int {
    fun conditionSatisfied() = false

    return if (conditionSatisfied()) {
        1
    } else {
        //error is Nothing
        error("Condition is not satisfied")
    }
}