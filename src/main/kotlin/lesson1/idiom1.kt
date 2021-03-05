package lesson1

/**
 * Interpolated string allow to construct string fast
 */
fun main() {
    println("This is a plain string")

    val arg = "Interpolated"
    println("This is an $arg string")

    val number = 1
    println("This is an $arg string number ${number + 1}")

    println("This is a string with \$")

    println("""
        This is a 
            multi
                line
                    raw
                        string
    """.trimIndent())

    println("""This is a raw string number ${number+1} with \ and ${'$'} """)
}