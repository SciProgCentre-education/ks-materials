package lesson4

import java.nio.file.Files
import java.nio.file.Paths

fun main() {
    val stream = Files.newInputStream(Paths.get("/some/file.txt"))
    // The resource is automatically closed  when leaving the scope
    stream.buffered().reader().use { reader ->
        println(reader.readText())
    }
}