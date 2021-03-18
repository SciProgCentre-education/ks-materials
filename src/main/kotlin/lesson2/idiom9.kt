package lesson2

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

    if (conditionSatisfied()) {
        return 1
    } else {
        //error is Nothing
        error("Condition is not satisfied")
    }
}