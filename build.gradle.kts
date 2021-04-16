plugins {
    kotlin("jvm") version "1.4.32"
}

group = "ru.mipt.npm"
version = "1.0"

// Where to get dependencies
repositories {
    mavenCentral()
}

dependencies {
    //loading coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.3")

    //testing libraries
    testImplementation(kotlin("test-junit5"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.0")
}

// Load testing platform
tasks.test {
    useJUnitPlatform()
}

// Set a byte-code target for JVM
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}