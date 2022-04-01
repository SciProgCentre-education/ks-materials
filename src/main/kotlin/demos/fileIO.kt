package demos

import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.readLines
import kotlin.io.path.useLines
import kotlin.io.path.writeLines

fun main() {
    val myFile: Path = Files.createTempFile("ks_demo", ".txt")
    myFile.writeLines((0..1000).map { it.toString() })

    println(myFile)

    val sum: Double = myFile.useLines {
        it.drop(10).take(10).map { line ->
            line.toDouble()
        }.sum()
    }

    println(sum)
}