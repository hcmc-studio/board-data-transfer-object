plugins {
    kotlin("jvm") version "1.9.0"
    kotlin("plugin.serialization") version "1.9.0"
}

group = "studio.hcmc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":kotlin-protocol-extension"))

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core-jvm:1.5.1")
}

kotlin {
    jvmToolchain(17)
}