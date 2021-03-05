package lesson1

/**
 * This is the entry point of the program. The body of this method is considered to be the body of the program.
 * `suspend` modifier allows to launch the program in asynchronous mode and could be omitted. [args] are used to pass
 * console arguments in a desktop application and also could be omitted.
 *
 * On JVM there could be several entry points that a distinguished by their fully-qualified name with kotlin-to-JVM
 * transformation (capitalized + Kt suffix).
 *
 * In Kts/Jupyter/Worksheet main function is absent. The body of the script plays that role.
 */
suspend fun main(args: Array<String>) {
    println("Hello Kotlin from MIPT!")
}